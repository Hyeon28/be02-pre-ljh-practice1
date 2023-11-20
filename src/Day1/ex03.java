package day1;

public class ex03 {
    public ex03() {
    }

    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */

        for(Integer i = 0; i < 5; i = i + 1) {
            for(Integer k = 0; k < 5; k = k + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
        */
        for(Integer i = 0; i < 6; i = i + 1) {
            for(Integer k = 0; k < i; k = k + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */
        for(Integer i = 0; i < 5; i = i + 1) {
            for(Integer k = 4; k > i; k = k - 1) {
                System.out.print(" ");
            }
            for(Integer k = 0; k < 2 * i + 1; k = k + 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}