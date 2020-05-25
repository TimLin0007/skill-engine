package com.timlin.guava.sample1;
/**
* @description 
* @author Tim Lin
* @create 2020-05-25 
**/


public class TestEvent4 {
    private final int message;

    /**
     * 构造方法
     * @param message
     */
    public TestEvent4(int message) {
        this.message = message;
        System.out.println("TestEvent4 事件message:"+message);
    }

    public int getMessage() {
        return message;
    }
}
