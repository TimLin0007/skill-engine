package com.timlin.guava.sample1;
/**
* @description 
* @author Tim Lin
* @create 2020-05-25 
**/

public class TestEvent2 {

    private final int message;

    /**
     * 构造方法
     * @param message
     */
    public TestEvent2(int message) {
        this.message = message;
        System.out.println("TestEvent2 事件message:"+message);
    }

    public int getMessage() {
        return message;
    }
}
