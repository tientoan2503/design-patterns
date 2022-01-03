package strategy.behaviors;

public class UnFlyable implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I can't fly :(");
  }
}
