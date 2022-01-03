package strategy.behaviors;

public class QuackQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("I am quack quack!");
  }
}
