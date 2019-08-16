package com.gof.visitor.demo3.Elements;

import com.gof.visitor.demo3.Visitors.Visitor;

/*
菜单项
 */
public class Item extends Component {
    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}


