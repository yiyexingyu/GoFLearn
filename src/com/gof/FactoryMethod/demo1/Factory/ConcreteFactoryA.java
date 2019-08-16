package com.gof.FactoryMethod.demo1.Factory;

import com.gof.FactoryMethod.demo1.Product.AbstractProduct;
import com.gof.FactoryMethod.demo1.Product.ConcreteProductA;

public class ConcreteFactoryA implements AbstractFactory {
    @Override
    public AbstractProduct createProduct() {
        System.out.println("具体工厂A生成--》具体产品A...");
        return new ConcreteProductA();
    }
}
