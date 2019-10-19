package com.gof.Strategy.demo1;

public class HotBackupStrategy extends Strategy {

    @Override
    public void backupDatabase() {
        System.out.println("开始进行数据库热备份...");

        System.out.println("数据库热备份成功完成...");
    }

}
