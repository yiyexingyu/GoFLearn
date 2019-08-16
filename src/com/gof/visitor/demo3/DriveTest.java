package com.gof.visitor.demo3;

import com.gof.visitor.demo3.Elements.Component;
import com.gof.visitor.demo3.Elements.Item;
import com.gof.visitor.demo3.Elements.Menu;
import com.gof.visitor.demo3.Visitors.MenuVisitor;

public class DriveTest {

    public static void main(String[] args) {
        Component menu = SimpleFactory();
        Waitress waitress = new Waitress(menu);
        waitress.printMenu(new MenuVisitor());
    }

    private static Component SimpleFactory() {
        // 菜单
        Component menu = new Menu("菜单", "xxx饭店菜单");

        // 菜单项
        Component menuA = new Menu("饭类", "类别：主食类");
        Component menuB = new Menu("水类", "类别：补充水分");
        Component menuC = new Menu("小吃类", "类别：零食");
        Component menuD = new Menu("汤类", "类别：水类的子类");
        menu.add(menuA);
        menu.add(menuB);
        menu.add(menuC);

        //菜单项中具体类别
        Component itemA1 = new Item("牛肉", 15f);
        Component itemA2 = new Item("鸡肉", 13f);
        Component itemA3 = new Item("鸭肉", 14f);
        menuA.add(itemA1);
        menuA.add(itemA2);
        menuA.add(itemA3);

        Component itemB1 = new Item("红茶", 4f);
        Component itemB2 = new Item("奶茶", 6f);
        menuB.add(itemB1);
        menuB.add(itemB2);
        menuB.add(menuD);   //菜单项的包含

        Component itemC1 = new Item("烤翅", 8f);
        Component itemC2 = new Item("尾虾", 8f);
        Component itemC3 = new Item("鱿鱼", 5f);
        menuC.add(itemC1);
        menuC.add(itemC2);
        menuC.add(itemC3);

        Component itemD1 = new Item("菜汤", 6f);
        Component itemD2 = new Item("酸汤", 6f);
        Component itemD3 = new Item("其他汤", 5f);
        menuD.add(itemD1);
        menuD.add(itemD2);
        menuD.add(itemD3);

        return menu;
    }
}

