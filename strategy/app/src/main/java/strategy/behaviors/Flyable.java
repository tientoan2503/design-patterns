package strategy.behaviors;
public class Flyable implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I am flying!");
  }
}
