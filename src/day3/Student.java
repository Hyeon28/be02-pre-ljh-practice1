package day3;

public class Student {

    String name;
    Integer age;
    String gender;
    Integer fullness;
    Integer intelligence;

    Integer eating(String menu, Integer amount) {
        fullness += amount;
        return fullness;
    }
    Integer studying(String subject, Integer time)
    {
        intelligence = intelligence + time*2;
        return intelligence;
    }

}
