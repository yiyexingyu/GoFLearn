package com.gof.visitor.demo1.visitors;

import com.gof.visitor.demo1.Elements.ConcreteElementA;
import com.gof.visitor.demo1.Elements.ConcreteElementB;

public class ConcreteVisitorA implements Visitor {

    public ConcreteVisitorA() {
    }

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者A访问---》" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者A访问---》" + concreteElementB.operationB());
    }
}
