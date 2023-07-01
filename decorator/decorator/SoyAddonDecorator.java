package decorator.decorator;

import decorator.component.Beverage;

public class SoyAddonDecorator extends AddonDecorator{

    public SoyAddonDecorator(Beverage beverage){
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 1;
    }
    
}
