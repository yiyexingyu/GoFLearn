package com.gof.Strategy.demo1;

public class LogicBackupStrategy extends Strategy {
    @Override
    public void backupDatabase() {
        System.out.println("开始进行数据库逻辑备份...");

        System.out.println("数据库逻辑备份成功完成...");
    }
}
