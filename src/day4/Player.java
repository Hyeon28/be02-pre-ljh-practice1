package day4;

public class Player {


    private Integer life;
    private String name;
    private static Integer score;

    public Player(Integer life, String name, Integer score) {
        this.life = life;
        this.name = name;
        this.score = score;
    }

    public Integer getLife() {
        return life;
    }

    public static Integer getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public Integer loseLife(){
        life --;
        return life;
    }
    public void scoreUp(){
        score++;
    }
    public void loseScore(){
        score--;
        if(score<=0){
            score = 0;
        }
    }


}

