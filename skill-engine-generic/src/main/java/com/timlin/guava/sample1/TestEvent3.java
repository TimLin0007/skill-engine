package com.timlin.guava.sample1;
/**
* @description 
* @author Tim Lin
* @create 2020-05-25 
**/

public class TestEvent3 extends TestEvent2 {

    private final int message;

    /**
     * 构造方法
     * @param message
     */
    public TestEvent3(int message) {
        super(message);
        this.message = message;
        System.out.println("TestEvent2 事件message:"+message);
    }

    @Override
    public int getMessage() {
        return message;
    }
}
