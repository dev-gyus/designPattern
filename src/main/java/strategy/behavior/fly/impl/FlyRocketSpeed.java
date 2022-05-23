package strategy.behavior.fly.impl;

import strategy.behavior.fly.FlyBehavior;

public class FlyRocketSpeed implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 속도로 날아갑니다!");
    }
}
