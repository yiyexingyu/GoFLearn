package com.gof.visitor.demo3.Visitors;

import com.gof.visitor.demo3.Elements.Element;
import com.gof.visitor.demo3.Elements.Item;

public class ItemVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        if (element instanceof Item) {
            Item item = (Item) element;
            System.out.println(
                    "[商品名=" + item.getName() + ", 价格=" + item.getPrice() + "]");
        }
    }
}
