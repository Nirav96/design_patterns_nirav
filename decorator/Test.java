package decorator;

import decorator.component.EspressoBeverage;
import decorator.decorator.CaremelAddonDecorator;
import decorator.decorator.SoyAddonDecorator;

public class Test{
    public static void main(String[] args) {
        EspressoBeverage espressoBeverage = new EspressoBeverage();
        CaremelAddonDecorator caremelAddonDecorator = new CaremelAddonDecorator(espressoBeverage);
        SoyAddonDecorator soyAddonDecorator = new SoyAddonDecorator(caremelAddonDecorator);
        System.out.println(soyAddonDecorator.cost());
    }
}