package factory;

import factory.factory.IProductFactory;
import factory.factory.ProductFactory;
import factory.product.IProduct;

public class Test {
    public static void main(String[] args) {
        IProductFactory factory = new ProductFactory();
        IProduct product1 = factory.factoryMethod("A");
        IProduct product2 = factory.factoryMethod("B");
        product1.desc();
        product2.desc();
    }
}
