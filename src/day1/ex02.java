package day1;

public class ex02 {
    public ex02() {
    }

    public static void main(String[] args) {
        for(Integer i = 0; i < 6; i = i + 1) {
            Integer num = (int)(Math.random() * 10);
            System.out.print(num + " ");
        }

    }
}