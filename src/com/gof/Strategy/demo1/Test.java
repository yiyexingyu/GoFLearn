package com.gof.Strategy.demo1;

public class Test {
    public static void main(String[] args) {
        System.out.println("测试逻辑策略");
        DBBackupContext context = new DBBackupContext(new LogicBackupStrategy());

        System.out.println("测试热策略");
        context = new DBBackupContext(new HotBackupStrategy());

        System.out.println("测试冷策略");
        context = new DBBackupContext(new ColdBackupStrategy());
    }
}
