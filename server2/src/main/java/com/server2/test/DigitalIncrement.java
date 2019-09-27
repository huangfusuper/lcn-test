package com.server2.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author huangfu
 */
public class DigitalIncrement {

    /**
     * 最大次数
     */
    private static final int MAX_NUM = 15;
    /**
     * 累计次数
     */
    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 序列+1
     * @return
     */
    public synchronized static int getNumIncrease(){
        return atomicInteger.compareAndSet(MAX_NUM, 1) ? atomicInteger.get() : atomicInteger.incrementAndGet();
    }


    public static void main(String[] args) {
        for(int i=0; i<32 ;i++){
            System.out.println(DigitalIncrement.getNumIncrease());
        }

    }
}
