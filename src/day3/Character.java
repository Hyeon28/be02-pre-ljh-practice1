package day3;

public class Character {

    //이름, 공격력, 사거리, 체력, 방어력, 레벨, 경험치, 좌표 x,y, 아이템 리스트(최대 6개)
    String name;
    Integer power, reach, hp, dp, lv, exp, corX, corY;
    String[] itemList;


    public Character(String name, Integer power, Integer reach, Integer hp, Integer dp, Integer lv, Integer exp, Integer corX, Integer corY, String[] itemList) {
        this.name = name;
        this.power = power;
        this.reach = reach;
        this.hp = hp;
        this.dp = dp;
        this.lv = lv;
        this.exp = exp;
        this.corX = corX;
        this.corY = corY;
        this.itemList = itemList;
    }


    //경헙치 증가
    Integer exp_up(String enemy) {
        //미니언이면 10, 용이면 50, 타워면 100
        if (enemy == "minion") {
            exp += 10;
        } else if (enemy == "dragon") {
            exp += 50;
        } else if (enemy == "tower") {
            exp += 10;
        }
        //현재 경험치가 100보다 크면 레벨업
        //레법업 하고 남은 경험치
        if (exp >= 100) {
            lv_up();
            exp %= 100;
        }
        return exp;
    }

    //래밸업
    Integer lv_up() {
        //레벌 1업
        //공격력 +10%, 체력 +20%, 방어력 +5%
        lv++;
        power = power + power / 10;
        hp = hp + hp / 5;
        dp = dp * dp / 20;
        return lv;
    }

    //이동
    void move(Integer x, Integer y) {
        corX += x;
        corY += y;
        /*
        this.x += x;
        this.y += y;
         */
    }

    //귀환
    void backhome() {
        corX = 0;
        corY = 0;
    }
    void die() {
        this.backhome();
        this.hp = 100;
    }

    Integer attacked(Integer power) {
        this.hp -= power;
        if (hp <= 0) {
            this.die();
        }
        return hp;
    }

    /*
        attacked 매소드 오버로딩을 ㅣ용해서 숫자를 하나 더 전달 받는 매소드를 생성
    */
    Integer attacked(Integer power, Integer number){
        /*
        1부터 100사이의 랜덤 숫자를 생성
        만약 90 이상이면 3배 크리티컬
        80 이상 2배
        그외 일반 공격
         */
        this.hp -= power * number;
        if (hp <= 0) {
            this.die();
        }
        return hp;
    }

    void attackTo(Character target) {

        int random = (int)(Math.random() * 100 +1);

        //target.hp -= this.power;
        target.attacked(this.power);
        if(random >= 90){
            target.attacked(this.power, 3);
        } else if (random >= 80) {
            target.attacked(this.power, 2);
        }else {
            target.attacked(this.power);
        }

    }

    String[] shopping(String item) {
        for (int i = 0; i < this.itemList.length; i++) {
            if (this.itemList[i] == null) {
                itemList[i] = item;
                break;
            }
        }
        return itemList;
    }
}

