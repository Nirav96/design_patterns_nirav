package decorator.decorator;

import decorator.component.Beverage;

public abstract class AddonDecorator implements Beverage{
    protected Beverage beverage;

    public AddonDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public abstract int cost();
}
