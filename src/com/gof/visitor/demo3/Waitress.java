package com.gof.visitor.demo3;

import com.gof.visitor.demo3.Visitors.Visitor;
import com.gof.visitor.demo3.Elements.Component;

public class Waitress {
    private Component menu;

    public Waitress(Component menu) {
        this.menu = menu;
    }

    public void printMenu(Visitor visitor) {
        menu.accept(visitor);
    }
}
