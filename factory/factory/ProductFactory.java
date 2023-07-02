package factory.factory;

import factory.product.IProduct;
import factory.product.ProductA;
import factory.product.ProductB;

public class ProductFactory implements IProductFactory{

    @Override
    public IProduct factoryMethod(String product) {
        switch(product){
            case "A": return new ProductA();
            case "B": return new ProductB();
            default: return new ProductA();
        }
    }

}
