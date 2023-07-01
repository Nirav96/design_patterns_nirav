package stratagy;

import stratagy.display.SimpleDisplayBehaviour;
import stratagy.display.SpecialDisplayBehaviour;
import stratagy.duck.Duck;
import stratagy.quack.SimpleQuackBehaviour;
import stratagy.quack.SpecialQuackBehaviour;

public class Test {
    public static void main(String[] args) {
        // We can define any number of type of display and quack behaviour and we can inject into duck constructor
        Duck duck1 = new Duck(new SimpleDisplayBehaviour(), new SimpleQuackBehaviour());
        duck1.getDisplayBehaviour().display();
        duck1.getQuackBehaviour().quack();

        Duck duck2 = new Duck(new SpecialDisplayBehaviour(), new SpecialQuackBehaviour());
        duck2.getDisplayBehaviour().display();
        duck2.getQuackBehaviour().quack();
    }
}
