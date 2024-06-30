package dz1;

public class Archer extends Hero{
    private static final int DAMAGE = 3;
    private static final double ACCURACY_MODIFIER = 0.2;
    public Archer(String name, int health) {
        super(name,health);
    }
    @Override
    public  void attackEnemy(Enemy enemy){
        System.out.println("Лучник " + super.getName() + " стреляет во врага!");
        // лучник стреляет удачно в 80% случаев
        if(Math.random() > ACCURACY_MODIFIER) {
            System.out.println("Успешный выстрел!");
            enemy.takeDamage(DAMAGE); // наносимый лучником урон = 3
        }
        else{
            System.out.println("Неудачный выстрел!");
        }
    }
}
