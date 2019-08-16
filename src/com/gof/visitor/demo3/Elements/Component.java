package com.gof.visitor.demo3.Elements;

public abstract class Component implements Element {

    // 元素集合操作-增
    public void add(Component menuComponent){
        throw new UnsupportedOperationException();
    }

    // 元素集合操作-删
    public void remove(Component menuComponent){
        throw new UnsupportedOperationException();
    }

    // 元素集合操作-查
    public Component getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public float getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print(int offset){
        throw new UnsupportedOperationException();
    }


}





