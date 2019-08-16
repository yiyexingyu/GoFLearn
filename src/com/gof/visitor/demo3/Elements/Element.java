package com.gof.visitor.demo3.Elements;


import com.gof.visitor.demo3.Visitors.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
