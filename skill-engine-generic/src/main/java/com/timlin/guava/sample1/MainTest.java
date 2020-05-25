package com.timlin.guava.sample1;

import com.google.common.eventbus.EventBus;

/**
* @description 
* @author Tim Lin
* @create 2020-05-25 
**/

public class MainTest {

    public static void main(String[] args) {
        // 1.构造一个事件总线
        EventBus eventBus = new EventBus("test");

        // 2.构造一个事件监听器
        EventListener listener = new EventListener();

        // 3.把事件监听器注册到事件总线上
        eventBus.register(listener);

        // 4.事件总线发布事件，触发监听器方法
        eventBus.post(new TestEvent1(1));
        eventBus.post(new TestEvent2(2));
        // 事件3是事件2子类，虽然监听器只订阅了父类事件2，一样可以监听到子类
        eventBus.post(new TestEvent3(3));
        // 未被订阅的事件,用DeadEvent可订阅
        eventBus.post(new TestEvent4(4));
    }
}
