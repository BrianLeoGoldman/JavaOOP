package designPatterns.creational.factory_method.factories;

import designPatterns.creational.factory_method.Enemy;
import designPatterns.creational.factory_method.Ghost;
import designPatterns.creational.factory_method.Monster;
import designPatterns.creational.factory_method.Soldier;

public class RandomEnemyFactory implements EnemyFactory {

    @Override
    public Enemy createEnemy() {
        int enemyType = (int) (Math.floor(Math.random() * (3 + 1) + 0));
        if(enemyType == 0) {
            int life = (int) (Math.floor(Math.random() * (120 - 40 + 1) + 40));
            int strength = (int) (Math.floor(Math.random() * (80 - 30 + 1) + 30));
            return new Soldier(life, strength, "Potion");
        }
        if(enemyType == 1) {
            int life = (int) (Math.floor(Math.random() * (250 - 70 + 1) + 70));
            int strength = (int) (Math.floor(Math.random() * (260 - 120 + 1) + 120));
            return new Monster(life, strength, "Claw");
        }
        else {
            int life = (int) (Math.floor(Math.random() * (170 - 70 + 1) + 70));
            int strength = (int) (Math.floor(Math.random() * (80 - 60 + 1) + 60));
            return new Ghost(life, strength, "Ectoplasm");
        }
    }
}
