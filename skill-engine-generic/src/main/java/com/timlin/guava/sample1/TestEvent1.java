package com.timlin.guava.sample1;
/**
* @description 
* @author Tim Lin
* @create 2020-05-25 
**/

public class TestEvent1 {

    private final int message;

    /**
     * 构造方法
     * @param message
     */
    public TestEvent1(int message) {
        this.message = message;
        System.out.println("TestEvent1 事件message:"+message);
    }

    public int getMessage() {
        return message;
    }
}
