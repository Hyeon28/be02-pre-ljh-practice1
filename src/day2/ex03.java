package day2;

import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        //배열을 사용해 6개의 숫자를 입력받고 6개의 숫자를 거꾸로 출력하시오
        Scanner scanner= new Scanner(System.in);
        int [] arr = new int[6];
        System.out.println("숫자를 입력해주세요");
        for(int i = 0; i<6; i++){
            arr[i] = scanner.nextInt();
        }
        //5부터 0까지 반복 배역 반복 횟수 번째의 숫자를 출력
        for(int j = 5; j>=0; j--){
            System.out.print(arr[j]);
        }

    }
}