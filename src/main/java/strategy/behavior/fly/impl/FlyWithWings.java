package strategy.behavior.fly.impl;

import strategy.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("두 날개로 날아요");
    }
}
