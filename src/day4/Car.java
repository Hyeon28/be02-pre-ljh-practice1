package day4;

public class Car {

    private String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }
    public void movePos(){
        position++;
        System.out.println("한칸 전진!🏎️");
    }
    public void movePos2(){
        position++;
    }
    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
