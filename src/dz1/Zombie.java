package dz1;

public class Zombie extends Enemy{
    private static final int DAMAGE = 1;
    private static final double RESURRECTION_MODIFIER = 0.7;
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби нападает на героя!");
        hero.takeDamage(DAMAGE); // зомби наносит урон, равный 1
    }

    @Override
    public void takeDamage(int damage){
        super.takeDamage(damage);
        // зомби может воскреснуть со здоровьем = 1 в 30% случаев
        if(!super.isAlive() && Math.random() > RESURRECTION_MODIFIER) {
            System.out.println("Зомби воскрес!");
            System.out.println("Здоровье врага: 1");
            super.setHealth(1);
        }
    }
}
