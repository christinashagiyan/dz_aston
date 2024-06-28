package dz1;

public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name,health);
    }
    @Override
    public  void attackEnemy(Enemy enemy){
        System.out.println("Лучник " + super.getName() + " стреляет во врага!");
        // лучник стреляет удачно в 80% случаев
        if(Math.random()>0.2) {
            System.out.println("Успешный выстрел!");
            enemy.takeDamage(3); // наносимый лучником урон = 3
        }
        else{
            System.out.println("Неудачный выстрел!");
        }
    }
}
