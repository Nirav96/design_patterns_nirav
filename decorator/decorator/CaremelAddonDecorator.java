package decorator.decorator;

import decorator.component.Beverage;

public class CaremelAddonDecorator extends AddonDecorator{

    public CaremelAddonDecorator(Beverage beverage){
        super(beverage);
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 2;
    }
    
}
