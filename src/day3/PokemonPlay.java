package day3;

public class PokemonPlay {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(
                "피카츄",
                "전기",
                10,
                1,
                100,
                0,
                0,
                0
        );

        FlyPokemon pidgeot = new FlyPokemon(
                "피죤투",
                "비행",
                10,
                1,
                100,
                0,
                0,
                0,
                0
        );


        System.out.println("피카츄가 피죤투를 공격했다");
        pikachu.attack(pidgeot);
        System.out.println(pidgeot.hp);

        System.out.println("피카츄가 피죤투를 공격했다");
        pikachu.attack(pidgeot);
        System.out.println(pidgeot.hp);

        System.out.println("피죤투의 날아오르기");
        pidgeot.fly();
        System.out.println(pidgeot.hp);






    }
}



