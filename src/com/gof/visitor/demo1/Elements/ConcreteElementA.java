package com.gof.visitor.demo1.Elements;

import com.gof.visitor.demo1.visitors.Visitor;

public class ConcreteElementA implements Element {

    public ConcreteElementA() {
    }

    public String operationA() { return "具体元素A的操作"; }

    @Override
    public void accept(Visitor visitor) { visitor.visit(this); }
}
