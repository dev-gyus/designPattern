package strategy.race;

import strategy.Duck;
import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.fly.impl.FlyWithWings;
import strategy.behavior.quack.QuackBehavior;
import strategy.behavior.quack.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리 입니다");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        super.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        super.quackBehavior = qb;
    }
}
