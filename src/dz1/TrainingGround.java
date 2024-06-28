package dz1;

public class TrainingGround {
    public static void main(String[] args) {
        // тестирование атаки героя
        Enemy enemy = new Zombie(3);
        Hero venus = new Warrior("Венера",7);
        venus.attackEnemy(enemy );
        Hero mars = new Mage("Марс",5);
        mars.attackEnemy(enemy );
        Hero mercury = new Archer("Меркурий",4);
        mercury.attackEnemy(enemy );
    }
}
