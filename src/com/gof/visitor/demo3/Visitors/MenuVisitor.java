package com.gof.visitor.demo3.Visitors;

import com.gof.visitor.demo3.Elements.Component;
import com.gof.visitor.demo3.Elements.Element;
import com.gof.visitor.demo3.Elements.Item;
import com.gof.visitor.demo3.Elements.Menu;

import java.util.List;

public class MenuVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        if (Menu.class.isAssignableFrom(element.getClass())){
            Menu menu = (Menu) element;
            System.out.println(
                    "{菜单名=" + menu.getName() + "，描述=" + menu.getDescription() + "}");
            List<Component> menuComponents = menu.getMenuComponents();
            for (Component menuComponent : menuComponents) {
                if (menuComponent instanceof Menu){
                    menuComponent.accept(this);
                } else {
                    menuComponent.accept(new ItemVisitor());
                }
            }
        }
    }
}








