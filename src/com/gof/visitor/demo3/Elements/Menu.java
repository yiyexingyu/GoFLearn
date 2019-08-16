package com.gof.visitor.demo3.Elements;

import com.gof.visitor.demo3.Visitors.Visitor;

import java.util.ArrayList;
import java.util.List;

/*
组合菜单
 */
public class Menu extends Component {
    private List<Component> menuComponents = new ArrayList<Component>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public List<Component> getMenuComponents() {
        return menuComponents;
    }

    @Override
    public void add(Component menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void remove(Component menuComponent) {
        this.menuComponents.remove(menuComponent);
    }

    @Override
    public Component getChild(int i) {
        return this.menuComponents.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}










