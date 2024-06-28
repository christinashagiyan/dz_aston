package dz1;

public abstract class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public abstract void attackHero(Hero hero);
    public void takeDamage(int damage){
        health-= damage;
        System.out.println("Здоровье врага: "+ this.getHealth());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
