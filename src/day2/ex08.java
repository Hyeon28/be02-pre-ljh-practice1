package day2;

public class ex08 {
    public static void main(String[] args) {
        //로또 번호 생성기
        //로또 번호는 1~45 중 중복이 없이 6개를 고르는것
        //변수, 조건문, 반복문, 배열만 사용

        int lotto[] = new int[6];

        for(int i = 0; i<6; i++){
            lotto[i] = (int)(Math.random() * 45+1);
            for(int j = 0; j < i; j ++){
                if(lotto[i] == lotto[j])
                {
                    i--;
                    break;
                }
            }
        }

        System.out.print("금주의 로또 번호 : " );
        for(int i = 0; i<6; i++){
            System.out.print(" " + lotto[i]);
        }
    }
}