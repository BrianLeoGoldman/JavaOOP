package designPatterns.creational.factory_method.factories;

import designPatterns.creational.factory_method.Enemy;
import designPatterns.creational.factory_method.Ghost;
import designPatterns.creational.factory_method.Monster;
import designPatterns.creational.factory_method.Soldier;

import java.util.Objects;

public class BalancedEnemyFactory implements EnemyFactory {

    private String lastEnemyCreated;

    public BalancedEnemyFactory(String firstEnemyToCreate) {
        this.lastEnemyCreated = firstEnemyToCreate;
    }

    @Override
    public Enemy createEnemy() {
        if (Objects.equals(this.lastEnemyCreated, "Soldier")) {
            this.lastEnemyCreated = "Monster";
            return new Monster(200, 100, "Claw");
        }
        if (Objects.equals(this.lastEnemyCreated, "Monster")) {
            this.lastEnemyCreated = "Ghost";
            return new Ghost(90, 90, "Ectoplasm");
        }
        else {
            this.lastEnemyCreated = "Soldier";
            return new Soldier(120, 110, "Potion");
        }
    }
}
