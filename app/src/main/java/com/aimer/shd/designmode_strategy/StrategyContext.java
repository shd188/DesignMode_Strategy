package com.aimer.shd.designmode_strategy;

/**
 * Created by shd on 2015/9/8.
 */
public class StrategyContext  {
    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomeThing(){
        this.strategy.doSomeThing();
    }
}
