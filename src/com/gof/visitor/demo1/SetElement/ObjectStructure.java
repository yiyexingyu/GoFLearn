package com.gof.visitor.demo1.SetElement;

import com.gof.visitor.demo1.Elements.Element;
import com.gof.visitor.demo1.visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> elementList = new ArrayList<Element>();

    public ObjectStructure() {
    }

    public void accept(Visitor visitor) {
        for (Element element : this.elementList) {
            element.accept(visitor);
            System.out.println(element);
        }
    }

    public void addElement(Element element) {
        this.elementList.add(element);
    }

    public void removeElement(Element element) {
        this.elementList.remove(element);
    }
}
