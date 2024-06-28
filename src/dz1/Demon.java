package dz1;

public class Demon extends Enemy{

    public Demon(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Демон нападает на героя!");
        // демон атакует со случайным уроном в диапазоне [0;4]
        hero.takeDamage((int)(Math.random()*10/2));
    }
}
