package com.gof.visitor.demo1.Elements;

import com.gof.visitor.demo1.visitors.Visitor;

public class ConcreteElementB implements Element {

    public ConcreteElementB(){}

    public String operationB() { return "具体元素B的操作"; }

    @Override
    public void accept(Visitor visitor) { visitor.visit(this); }
}
