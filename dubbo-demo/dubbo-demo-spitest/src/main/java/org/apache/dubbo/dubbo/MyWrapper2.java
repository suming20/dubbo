package org.apache.dubbo.dubbo;

import org.apache.dubbo.dubbo.common.Configuration;

/**
 * @author suming
 * @since 2025/4/4 14:23
 */
public class MyWrapper2 implements DubboSpiInterface {

    private final DubboSpiInterface anInterface;

    private Cooking cooking;

    public MyWrapper2(DubboSpiInterface anInterface) {
        this.anInterface = anInterface;
    }

    @Override
    public String getClassName() {
        System.out.println("MyWrapper Start2");
        String res = "myWrapper2:=";
        res += anInterface.getClassName();
        System.out.println("MyWrapper End2");
        return res;
    }

    @Override
    public void start(Configuration configuration) {
        System.out.println("wrapper: " + configuration.getSpiName());
    }

    public void setCooking(Cooking cooking) {
        this.cooking = cooking;
        System.out.println("setCooking " + cooking.getClass().getName());
    }
}
