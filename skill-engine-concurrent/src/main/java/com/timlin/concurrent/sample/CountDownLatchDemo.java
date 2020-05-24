package com.timlin.concurrent.sample;

import java.util.concurrent.CountDownLatch;

/**
* @description 
* @author Tim Lin
* @create 2020-05-24 
**/

public class CountDownLatchDemo {

    private static CountDownLatch countDownLatch = new CountDownLatch(5);

    /**
     * Boss线程，等待员工到达开会
     */
    static class BossThread extends Thread{
        @Override
        public void run() {
            System.out.println("Boss在会议室等待，总共有" + countDownLatch.getCount() + "个人开会...");
            try {
                //Boss等待
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("所有人都已经到齐了，开会吧...");
        }
    }

    /**
     * 员工到达会议室线程
     */
    static class EmpleoyeeThread  extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "，到达会议室......");
            //员工到达会议室 count - 1
            countDownLatch.countDown();
        }
    }

    public static void main(String[] args){
        /**
         * Boss线程启动
         */
        new BossThread().start();
        for(int i = 0 ; i < 5 ; i++){
            new EmpleoyeeThread().start();
        }
        System.out.println("主线程执行完毕......");

    }

}
