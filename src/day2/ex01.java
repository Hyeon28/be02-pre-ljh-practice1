package day2;
public class ex01 {
    public static void main(String[] args) {
        /*1~100까지 총합
        i가 1부터 100까지 1씩 증가하면서 반복
        총합에 i룰 더해서 저장
        */
        int total = 0;
        for(int i = 1; i<=100; i++){
            total = total + i;
        }

        System.out.println(total);
    }
}