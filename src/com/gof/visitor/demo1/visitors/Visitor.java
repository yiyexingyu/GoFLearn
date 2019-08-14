package com.gof.visitor.demo1.visitors;

import com.gof.visitor.demo1.Elements.ConcreteElementA;
import com.gof.visitor.demo1.Elements.ConcreteElementB;

public interface Visitor {
    void visit(ConcreteElementA concreteElementA);
    void visit(ConcreteElementB concreteElementB);
}
