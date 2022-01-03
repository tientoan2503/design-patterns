package strategy;
import strategy.objects.*;
public class Main {
  public static void main(String[] args) {
    // Vịt trời 
    MallardDuck mallardDuck = new MallardDuck();
    mallardDuck.display();
    mallardDuck.performQuack();
    mallardDuck.performFly();

    // Vịt cao su 
    RubberDuck rubberDuck = new RubberDuck();
    rubberDuck.display();
    rubberDuck.performQuack();
    rubberDuck.performFly();
  }
}
