package day1;

public class ex01 {
    public ex01() {
    }

    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 20;
        Integer temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);
    }
}
