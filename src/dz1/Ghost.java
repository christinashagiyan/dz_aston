package dz1;

public class Ghost extends Enemy{

    public Ghost(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Призрак нападает на героя!");
        hero.takeDamage(2); // наносимый призраком урон = 2
    }

    @Override
    public void takeDamage(int damage){
        // призрак может избежать потерю здоровья за счет исчезновения в 30% случаев
        if(Math.random() > 0.7){
            System.out.println("Призрак исчез!");
            System.out.println("Здоровье врага: " + super.getHealth());
        }
        else
            super.takeDamage(damage);
    }

}
