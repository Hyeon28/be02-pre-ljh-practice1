package day4;

public class Card {

    private Integer number;
    private String shape;
    private static Integer width;
    private static Integer height;

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", shape='" + shape + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public Card(Integer number, String shape, Integer width, Integer height) {
        this.number = number;
        this.shape = shape;
        this.width = width;
        this.height = height;
    }
}
