package dz1;

public class ManyEnemiesTest {
    // сражение с несколькими врагами одновременно
    public static void main(String[] args) {
        Hero pluto = new Archer("Плутон", 8);
        Enemy zombie = new Zombie(4);
        Enemy ghost = new Ghost(4);
        Enemy demon = new Demon(4);

        pluto.attackEnemy(zombie);
        zombie.attackHero(pluto);

        pluto.attackEnemy(ghost);
        ghost.attackHero(pluto);

        pluto.attackEnemy(demon);
        demon.attackHero(pluto);
    }
}
