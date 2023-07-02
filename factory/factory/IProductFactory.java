package factory.factory;

import factory.product.IProduct;

public interface IProductFactory {
    IProduct factoryMethod(String product);
}
