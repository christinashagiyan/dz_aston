package dz1;

public class Warrior extends Hero{
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public  void attackEnemy(Enemy enemy){
        System.out.println("Воин " + super.getName() + " нападает на врага!");
        enemy.takeDamage(1); // наносимый воином урон = 1
        // воин получает +1 к здоровью, если имеет четное число единиц здоровья в момент победы
        if(!enemy.isAlive()){
            System.out.println("Четное число единиц здоровья. Воин получает +1 к здоровью!");
            super.setHealth(super.getHealth()+1);
            System.out.println("Здоровье героя: " + super.getHealth());
        }
    }
}
