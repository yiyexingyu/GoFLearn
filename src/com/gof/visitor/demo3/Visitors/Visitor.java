package com.gof.visitor.demo3.Visitors;

import com.gof.visitor.demo3.Elements.Element;

public interface Visitor {
    void visit(Element element);
}
