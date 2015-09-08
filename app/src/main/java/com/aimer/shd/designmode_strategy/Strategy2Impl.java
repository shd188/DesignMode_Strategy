package com.aimer.shd.designmode_strategy;

import android.util.Log;

/**
 * 策略2
 * Created by shd on 2015/9/8.
 */
public class Strategy2Impl implements IStrategy {
    @Override
    public void doSomeThing() {
        Log.d("strategy","This is strategy 2");
        System.out.println("This is strategy 2");
    }
}
