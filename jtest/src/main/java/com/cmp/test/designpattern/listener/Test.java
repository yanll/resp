package com.cmp.test.designpattern.listener;

/**
 * Created by breez on 2016/01/05.
 */
public class Test {

    DemoSource ds;

    public Test() {
        try {
            ds = new DemoSource();
            //将监听器在事件源对象中登记
            DemoListener listener = new DemoListenerImpl();
            ds.addDemoListener(listener);
            ds.addDemoListener(new DemoListener() {
                public void handleEvent(DemoEvent event) {
                    System.out.println("Method come from 匿名类...");
                }
            });
            ds.notifyDemoEvent();//触发事件、通知监听器
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Test();
    }


}
