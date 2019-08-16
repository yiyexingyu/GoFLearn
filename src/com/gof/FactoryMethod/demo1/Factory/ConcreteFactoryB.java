package com.gof.FactoryMethod.demo1.Factory;

import com.gof.FactoryMethod.demo1.Product.AbstractProduct;
import com.gof.FactoryMethod.demo1.Product.ConcreteProductB;

public class ConcreteFactoryB implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        System.out.println("具体工厂B生成--》具体产品B...");
        return new ConcreteProductB();
    }
}
