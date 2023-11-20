package day1;

import java.util.Objects;

public class ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보
        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.
        // Player 클래스 생성 (이름, 무기)

        // 무승부면 반복
        // player01이 가위, 바위, 보 중 랜덤하게 하나를 선택
        // 객체 생성, 이름을 player1로 저장, 랜덤으로 가위바위보 중 하나 저장

        //player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
        // 객체 생성, 이름을 player2로 저장, 랜덤으로 가위바위보 중 하나 저장

        Player player1 = new Player();
        Player player2 = new Player();
        player1.name = "1번 플레이어";
        player2.name = "2번 플레이어";

        player1.game = (int)(Math.random() * 3+1);
        player2.game = (int)(Math.random() * 3+1);

        //switch 문으로 플레이어가 어떤 것을 냈는지 보여주기
        switch(player1.game)
        {
            case 1 :
                System.out.println("1번 플레이어 가위");
                break;
            case 2 :
                System.out.println("1번 플레이어 바위");
                break;
            case 3 :
                System.out.println("1번 플레이어 보");
                break;
        }

        switch(player2.game)
        {
            case 1 :
                System.out.println("2번 플레이어 가위");
                break;
            case 2 :
                System.out.println("2번 플레이어 바위");
                break;
            case 3 :
                System.out.println("2번 플레이어 보");
                break;
        }

        //두 플레이어가 비기지 않을때까지 랜덤으로 숫자 생성
        while(Objects.equals(player1.game, player2.game)){
            System.out.println("무승부");

            player1.game = (int)(Math.random() * 3+1);
            player2.game = (int)(Math.random() * 3+1);

            switch(player1.game)
            {
                case 1 :
                    System.out.println("1번 플레이어 가위");
                    break;
                case 2 :
                    System.out.println("1번 플레이어 바위");
                    break;
                case 3 :
                    System.out.println("1번 플레이어 보");
                    break;
            }

            switch(player2.game)
            {
                case 1 :
                    System.out.println("2번 플레이어 가위");
                    break;
                case 2 :
                    System.out.println("2번 플레이어 바위");
                    break;
                case 3 :
                    System.out.println("2번 플레이어 보");
                    break;
            }
        }

            //둘 중에 이긴 사람 이름 출력
            if(player1.game == 1){
                if(player2.game == 2){
                    System.out.println("2번 플레이어 승");
                }else
                {
                    System.out.println("1번 플레이어 승");
                }

            }
            else if(player1.game == 2){
                if(player2.game == 1){
                    System.out.println("1번 플레이어 승");
                }else
                {
                    System.out.println("2번 플레이어 승");
                }
            }
            else if(player1.game == 3){
                if(player2.game == 1){
                    System.out.println("2번 플레이어 승");
                }else
                {
                    System.out.println("1번 플레이어 승");
                }
            }

    }
}