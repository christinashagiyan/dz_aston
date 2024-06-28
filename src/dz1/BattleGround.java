package dz1;

public class BattleGround {
    // метод, моделирующий сражение
    public  static void fight(Hero hero, Enemy enemy){
        while(true){
            hero.attackEnemy(enemy);
            if (!enemy.isAlive()) break;
            enemy.attackHero(hero);
            if (!hero.isAlive()) break;
        }
        System.out.println(hero.isAlive() ? "Враг побежден" : "Герой побежден");
    }

    public static void main(String[] args) {
        // тестирование всех видов сражений

        System.out.println("\n---Воин против Зомби---\n");
        fight(new Warrior("Юпитер", 6), new Zombie(3));

        System.out.println("\n---Воин против Призрака---\n");
        fight(new Warrior("Сатурн", 8), new Ghost(3));

        System.out.println("\n---Воин против Демона---\n");
        fight(new Warrior("Уран", 7), new Demon(3));

        System.out.println("\n---Маг против Зомби---\n");
        fight(new Mage("Луна", 7), new Zombie(7));

        System.out.println("\n---Маг против Призрака---\n");
        fight(new Mage("Фобос", 8), new Ghost(10));

        System.out.println("\n---Маг против Демона---\n");
        fight(new Mage("Деймос", 6), new Demon(6));

        System.out.println("\n---Лучник против Зомби---\n");
        fight(new Archer("Ганимед", 3), new Zombie(6));

        System.out.println("\n---Лучник против Призрака---\n");
        fight(new Archer("Япет", 5), new Ghost(9));

        System.out.println("\n---Лучник против Демона---\n");
        fight(new Archer("Миранда", 5), new Demon(8));

    }
}
