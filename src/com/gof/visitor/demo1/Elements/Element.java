package com.gof.visitor.demo1.Elements;

import com.gof.visitor.demo1.visitors.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
