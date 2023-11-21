//배열에 월~일까지 초기화하고 0부터 6까지 숫자를 입력 받아
//같은 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시
//잘못 입력하셨습니다 출력

package day2;
import java.util.Scanner;

public  class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] weeks = {"월요일", "화요일","수요일", "목요일", "금요일", "토요일", "일요일" };

        System.out.println("숫자를 입력해주세요 : " );
        int num = scanner.nextInt();

        if(num<0||num>7){
            System.out.println("잘못 입력하셨습니다");
        }
        else {
            System.out.println(weeks[num]);
        }
    }
}