package com.aimer.shd.designmode_strategy;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrategyContext strategyContext;
        //策略1
        strategyContext = new StrategyContext(new Strategy1Impl());
        strategyContext.doSomeThing();
        //策略2
        strategyContext = new StrategyContext(new Strategy2Impl());
        strategyContext.doSomeThing();
        //策略3
        strategyContext = new StrategyContext(new Strategy3Impl());
        strategyContext.doSomeThing();

    }

}
