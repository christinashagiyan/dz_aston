package dz1;

public class Ghost extends Enemy{

    private static final int DAMAGE = 2;
    private static final double DISAPPEARANCE_MODIFIER = 0.7;
    public Ghost(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Призрак нападает на героя!");
        hero.takeDamage(DAMAGE); // наносимый призраком урон = 2
    }

    @Override
    public void takeDamage(int damage){
        // призрак может избежать потерю здоровья за счет исчезновения
        if(Math.random() > DISAPPEARANCE_MODIFIER){
            System.out.println("Призрак исчез!");
            System.out.println("Здоровье врага: " + super.getHealth());
        }
        else
            super.takeDamage(damage);
    }

}
