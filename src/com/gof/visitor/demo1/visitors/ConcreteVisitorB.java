package com.gof.visitor.demo1.visitors;

import com.gof.visitor.demo1.Elements.ConcreteElementA;
import com.gof.visitor.demo1.Elements.ConcreteElementB;

public class ConcreteVisitorB implements Visitor {

    public ConcreteVisitorB() {
    }

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者B访问---》" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者B访问---》" + concreteElementB.operationB());
    }
}
