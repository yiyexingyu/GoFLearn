package com.gof.FactoryMethod.demo1.Product;

public class ConcreteProductA implements AbstractProduct {
    @Override
    public void show() {
        System.out.println("具体产品A显示...");
    }

    public void showOther(){
        System.out.println("显示具体产品A其他信息...");
    }
}
