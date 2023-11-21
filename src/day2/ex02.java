package day2;
public class ex02 {
    public static void main(String[] args) {
        //총합을 홀수만 저장
        int total = 0;
        for(int i = 1; i<=100; i = i + 2){
            total = total + i;
        }

        System.out.println(total);
    }
}