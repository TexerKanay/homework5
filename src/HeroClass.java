public class HeroClass {
    public static class Hero {
        private int health;
        private int damage;
        private String heroAttackType;

        public Hero(int health, int damage, String heroAttackType) {
            this.health = health;
            this.damage = damage;
            this.heroAttackType = heroAttackType;
        }

        public Hero(int health, int damage) {
            this.health = health;
            this.damage = damage;
        }

        public int getHealth() {
            return health;
        }

        public int getDamage() {
            return damage;
        }

        public String getHeroAttackType() {
            return heroAttackType;
        }
    }
}

