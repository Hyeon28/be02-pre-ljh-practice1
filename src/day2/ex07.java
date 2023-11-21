package day2;
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};


        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력해주세요 : " );
        int money = scanner.nextInt();

        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i] + "원 " + money / unit[i] + "개");
            money = money % unit[i];
        }
    }
}