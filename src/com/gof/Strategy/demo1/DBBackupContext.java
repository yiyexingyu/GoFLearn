package com.gof.Strategy.demo1;

public class DBBackupContext {
    private Strategy strategy;

    public DBBackupContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeBackupDatabase() {
        this.strategy.backupDatabase();
    }
}
