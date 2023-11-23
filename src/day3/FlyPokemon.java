package day3;

public class FlyPokemon extends Pokemon{

    Integer corZ;

    public FlyPokemon(String name, String type, Integer damage, Integer level, Integer hp, Integer exp, Integer corX, Integer corY, Integer corZ){
        super(name, type,damage, level, hp, exp, corX, corY); //super() - 부모의 생성자 호출
        this.corZ = corZ;
    }

    @Override
    Integer attacked(Integer damage) {
        if(corZ==0){
            super.attacked(damage); //super. - 부모 객체
        }
        else{System.out.println("공격회피");}

        return this.hp;
    }

    int fly() {corZ++; return corZ;}
    int land() {corZ = 0; return corZ;}

}
