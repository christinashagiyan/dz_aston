package dz1;

public class Mage extends Hero{
    public Mage(String name, int health) {
        super(name, health);
    }
    @Override
    public  void attackEnemy(Enemy enemy){
        System.out.println("Маг " + super.getName() + " заколдовывает врага!");
        // маг атакует демонов с уроном 3, остальных врагов с уроном 2
        if(enemy instanceof Demon) enemy.takeDamage(3);
        else enemy.takeDamage(2);
    }
}
