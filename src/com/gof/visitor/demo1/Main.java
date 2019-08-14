package com.gof.visitor.demo1;

import com.gof.visitor.demo1.SetElement.ObjectStructure;
import com.gof.visitor.demo1.Elements.ConcreteElementA;
import com.gof.visitor.demo1.Elements.ConcreteElementB;
import com.gof.visitor.demo1.visitors.ConcreteVisitorA;
import com.gof.visitor.demo1.visitors.ConcreteVisitorB;
import com.gof.visitor.demo1.visitors.Visitor;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElementA());
        objectStructure.addElement(new ConcreteElementB());

        ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
        objectStructure.accept(concreteVisitorA);
        System.out.println("------------------------------------");
        objectStructure.accept(new ConcreteVisitorB());

        objectStructure.accept(new Visitor() {
            @Override
            public void visit(ConcreteElementA concreteElementA) {

            }

            @Override
            public void visit(ConcreteElementB concreteElementB) {

            }
        });
    }
}
