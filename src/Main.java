public class Main {

    public static HeroClass.Hero[] creteHeroes() {
        HeroClass.Hero hero1 = new HeroClass.Hero(100, 10, "Magical");
        HeroClass.Hero hero2 = new HeroClass.Hero(200, 10);
        HeroClass.Hero hero3 = new HeroClass.Hero(300, 10);

        HeroClass.Hero[] heroes = new HeroClass.Hero[3];
        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;

        return heroes;
    }


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);

//        System.out.println("boss " + "Health: " + boss.getHealth() + " Damage: " + boss.getDamage());
        HeroClass.Hero[] heroes = creteHeroes();

        for (HeroClass.Hero hero : heroes) {
            System.out.println("hero " +"health " + hero.getHealth() + " damage " + hero.getDamage() + " attack type " + hero.getHeroAttackType());
        }

    }
}
