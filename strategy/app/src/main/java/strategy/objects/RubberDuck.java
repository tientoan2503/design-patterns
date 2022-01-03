package strategy.objects;

import strategy.behaviors.*;
public class RubberDuck extends Duck {
  @Override
  public void display() {
    System.out.println("I was made from plastic");
  }

  public RubberDuck() {
    setFlyBehavior(new UnFlyable());
    setQuackBehavior(new Mute());
  }
}
