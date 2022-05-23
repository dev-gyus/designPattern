package strategy;

import strategy.behavior.fly.impl.FlyRocketSpeed;
import strategy.race.MallardDuck;
import strategy.race.ModelDuck;

public class MiniDuckSimulation {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketSpeed());
        modelDuck.performFly();
    }
}
