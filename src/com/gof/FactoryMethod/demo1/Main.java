package com.gof.FactoryMethod.demo1;

import com.gof.FactoryMethod.demo1.Factory.AbstractFactory;
import com.gof.FactoryMethod.demo1.Factory.ConcreteFactoryA;
import com.gof.FactoryMethod.demo1.Product.AbstractProduct;
import com.gof.FactoryMethod.demo1.Product.ConcreteProductA;

public class Main {
    public static void main(String[] args) {
        AbstractFactory concreteFactoryA = new ConcreteFactoryA();
        AbstractProduct product = concreteFactoryA.createProduct();
        product.show();
        ((ConcreteProductA)product).showOther();
    }
}
