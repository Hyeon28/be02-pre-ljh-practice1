package day4;
import java.util.Scanner;
public class CarRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("===========");
        System.out.println("- 경주 할 자동차 수");
        System.out.println("===========");
        int carNum = scanner.nextInt();
        Car cars[] = new Car[carNum];

        System.out.println("===========");
        System.out.println("- 경주 할 자동차 이름");
        System.out.println("===========");
        Scanner scanner1 = new Scanner(System.in);
        //int 입력을 위한 엔터가 인식이 되어서 새로운 Scanner 추가

        for (int i = 0; i < carNum; i++) {
            System.out.println((i+1)+"번째 자동차");
            String name = scanner1.nextLine();
            Car car = new Car(name, 0);
            cars[i] = car;
        }

        System.out.println("===========");
        System.out.println("- 시도할 회수");
        System.out.println("===========");
        int raceNum = scanner.nextInt();


        System.out.println("===========");
        for (int i = 0; i < raceNum; i++) {
            for (int j = 0; j < carNum; j++) {
                int play = (int) (Math.random() * 10);
                if (play > 3) {
                    System.out.print(cars[j].getName() + "는 ");
                    cars[j].movePos();
                } else {
                    System.out.println(cars[j].getName() + "는 멈춤");
                }
            }
            System.out.println();
        }
        System.out.println("===========");
        for (int i = 0; i < carNum; i++) {
            System.out.println(cars[i].getName() + "의 점수 : " + cars[i].getPosition());
        }

        int max = cars[0].getPosition();
        for (int i =0; i < carNum; i++) {
            if(max < cars[i].getPosition()){
                max = cars[i].getPosition();
            }
        }
        System.out.println("===========");
        System.out.print("우승자는 ");
        for (int i = 0; i < carNum; i++) {
            if (cars[i].getPosition() == max) {
                System.out.print(cars[i].getName() + " ");
            }
        }

    }
}
