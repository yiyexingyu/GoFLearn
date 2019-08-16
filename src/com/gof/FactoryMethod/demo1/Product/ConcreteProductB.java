package com.gof.FactoryMethod.demo1.Product;

public class ConcreteProductB implements AbstractProduct {
    @Override
    public void show() {
        System.out.println("具体产品B显示...");
    }
}
