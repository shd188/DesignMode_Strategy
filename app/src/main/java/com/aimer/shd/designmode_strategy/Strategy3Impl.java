package com.aimer.shd.designmode_strategy;

import android.util.Log;

/**
 * 策略3
 * Created by shd on 2015/9/8.
 */
public class Strategy3Impl implements IStrategy {
    @Override
    public void doSomeThing() {
        Log.d("strategy","This is strategy 3");
        System.out.println("This is strategy 3");
    }
}
