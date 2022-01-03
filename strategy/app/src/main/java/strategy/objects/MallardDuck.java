package strategy.objects;
import strategy.behaviors.*;

public class MallardDuck extends Duck {
  @Override
  public void display() {
    System.out.println("I am a real duck!");
  }

  public MallardDuck() {
    setFlyBehavior(new Flyable());
    setQuackBehavior(new QuackQuack());
  }
}
