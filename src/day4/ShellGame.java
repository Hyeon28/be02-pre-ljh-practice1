package day4;

import java.util.Scanner;
public class ShellGame {
    public static void main(String[] args) {
        int turn = 0;
        Player player1 = new Player(5, "1번 플레이어",0);
        Player player2 = new Player(5, "2번 플레이어",0);
            while (player1.getLife()!= 0 && player2.getLife() != 0) {
                if(turn % 2 == 0){
                    ShellGame.player1game(player1);
                    turn++;
                } else if (turn % 2 == 1) {
                    ShellGame.player1game(player2);
                    turn++;
                }
            }
            if (player1.getLife() <= 0) {
                    System.out.println("player 1 사망");
                    while(player2.getLife() != 0){
                        ShellGame.player1game(player2);
                    }
            }
            if (player2.getLife() <= 0) {
                    System.out.println("player 2 사망");
                    while(player1.getLife() != 0){
                    ShellGame.player1game(player1);
                    }
            }

    }
    public static void player1game(Player play) {
        int shell[] = new int[3];
            for (int i = 0; i < 3; i++) {
                shell[i] = (int) (Math.random() * 3 + 1);
                for (int j = 0; j < i; j++) {
                    if (shell[i] == shell[j]) {
                        i--;
                        break;
                    }
                }
            }
            System.out.println();
            System.out.println("=============");
            System.out.println("∩    ∩     ∩");
            System.out.println("1    2     3");
            System.out.println("컵을 골라주세요");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt() - 1;
            if(select<0 || select>2){
                System.out.println("다시 선택해주세요");
                return;
            }
            if (shell[select] == 1) { //정답
                play.scoreUp();
                System.out.println("\uD83C\uDF89정답\uD83D\uDC4F");
                System.out.println(play.getName()+ " 남은 목숨 " + play.getLife());
                System.out.println("현재 점수 " + play.getScore());

            } else if (shell[select] == 2) { //꽝
                play.loseLife();
                System.out.println("꽝");
                System.out.println(play.getName()+" 남은 목숨 " + play.getLife());
                System.out.println("현재 점수 " + play.getScore());
            } else {
                play.loseLife();
                play.loseScore();
                System.out.println("\uD83D\uDCA3폭탄\uD83D\uDCA5");
                System.out.println(play.getName()+" 남은 목숨 " + play.getLife());
                System.out.println("현재 점수 " + play.getScore());
            }

        if (play.getScore() >= 3) {
            System.out.println("승리하셨습니다!");
            System.exit(1);
        }

    }
}
