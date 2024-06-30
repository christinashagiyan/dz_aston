package dz1;

public class Mage extends Hero{
    private static final int DAMAGE = 2;
    public Mage(String name, int health) {
        super(name, health);
    }
    @Override
    public  void attackEnemy(Enemy enemy){
        System.out.println("Маг " + super.getName() + " заколдовывает врага!");
        // маг атакует демонов с уроном 3, остальных врагов с уроном 2
        if(enemy instanceof Demon) enemy.takeDamage(DAMAGE+1);
        else enemy.takeDamage(DAMAGE);
    }
}
