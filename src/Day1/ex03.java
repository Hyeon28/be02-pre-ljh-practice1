package Day1;

public class ex03 {
    public ex03() {
    }

    public static void main(String[] args) {
        Integer i;
        Integer k;
        for(i = 0; i < 5; i = i + 1) {
            for(k = 0; k < 5; k = k + 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for(i = 0; i < 6; i = i + 1) {
            for(k = 0; k < i; k = k + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(i = 0; i < 5; i = i + 1) {
            for(k = 4; k > i; k = k - 1) {
                System.out.print(" ");
            }
            for(k = 0; k < 2 * i + 1; k = k + 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}