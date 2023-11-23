package day3;
/*
    피카츄
	라이츄
	파이리
	꼬부기
	버터풀
	야도란

	피죤투
	또가스
 */
public class Pokemon {

    String name, type;
    Integer damage, level, hp, exp, corX, corY;

    public Pokemon(String name, String type, Integer damage, Integer level, Integer hp, Integer exp, Integer corX, Integer corY) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.level = level;
        this.hp = hp;
        this.exp = exp;
        this.corX = corX;
        this.corY = corY;
    }

    //경험치 얻기
    Integer getExp()
    {
        exp += 10;
        return exp;
    }
    //레벌업
    Integer levelUp()
    {
        if(exp>=100){level++;}
        exp %= 100;
        return level;
    }

    //공격한다
    void attack(Pokemon target){
        target.attacked(this.damage);
    }
    //공격받는다
    Integer attacked(Integer damage){
        this.hp = this.hp - damage;
        return hp;
    }
}
