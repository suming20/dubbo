package org.apache.dubbo.dubbo;

import org.apache.dubbo.dubbo.common.Configuration;

/**
 * @author suming
 * @since 2025/4/4 14:23
 */
public class MyWrapper implements DubboSpiInterface {

    private final DubboSpiInterface anInterface;

    public MyWrapper(DubboSpiInterface anInterface) {
        this.anInterface = anInterface;
    }

    @Override
    public String getClassName() {
        System.out.println("MyWrapper Start");
        String res = "myWrapper:=";
        res += anInterface.getClassName();
        System.out.println("MyWrapper End");
        return res;
    }

    @Override
    public void start(Configuration configuration) {
        System.out.println("wrapper: " + configuration.getSpiName());
    }
}
