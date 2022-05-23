package strategy.race;

import strategy.Duck;
import strategy.behavior.fly.impl.FlyNoWay;
import strategy.behavior.quack.impl.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
