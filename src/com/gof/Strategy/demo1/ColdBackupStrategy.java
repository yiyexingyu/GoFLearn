package com.gof.Strategy.demo1;

public class ColdBackupStrategy extends Strategy {

    @Override
    public void backupDatabase() {
        System.out.println("开始进行数据库冷备份...");

        System.out.println("数据库冷备份成功完成...");
    }

}
