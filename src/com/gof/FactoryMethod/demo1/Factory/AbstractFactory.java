package com.gof.FactoryMethod.demo1.Factory;

import com.gof.FactoryMethod.demo1.Product.AbstractProduct;

public interface AbstractFactory {
    public AbstractProduct createProduct();
}
