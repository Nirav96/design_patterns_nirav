package stratagy.duck;

import stratagy.display.IDisplayBehaviour;
import stratagy.quack.IQuackBehaviour;

public class Duck{
    private IDisplayBehaviour displayBehaviour;
    private IQuackBehaviour quackBehaviour;

    public Duck(IDisplayBehaviour displayBehaviour, IQuackBehaviour quackBehaviour) {
        this.displayBehaviour = displayBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public IDisplayBehaviour getDisplayBehaviour() {
        return displayBehaviour;
    }

    public void setDisplayBehaviour(IDisplayBehaviour displayBehaviour) {
        this.displayBehaviour = displayBehaviour;
    }

    public IQuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}