package day2;
public class ex05 {
    public static void main(String[] args) {
        //정수 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여
        //배열에 저장하고 배열에 든 숫자들의 총합

        int arr[] = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = (int)(Math.random() * 10+1);
        }
        int sum = 0;
        for(int i = 0; i<10; i++){
            sum += arr[i];
        }

        System.out.println(sum);

    }
}