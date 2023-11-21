package day2;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        //양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수의 평균을 출력하는 프로그램 작성

        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i = 0; i<10; i++){
            System.out.println("숫자를 입력해주세요");
            arr[i] = scanner.nextInt();
        }
        int sum = 0;

        for(int i = 0; i<10; i++){
            sum += arr[i];
        }
        sum = sum / arr.length;
        System.out.println("평균 " + sum );

    }
}