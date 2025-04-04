package org.apache.dubbo.dubbo.impl;

import org.apache.dubbo.dubbo.common.Configuration;
import org.apache.dubbo.dubbo.DubboSpiInterface;

/**
 * @author suming
 * @since 2025/4/4 11:08
 */
public class Test2DubboSpiImpl implements DubboSpiInterface {

    @Override
    public String getClassName() {
        return "test2 ";
    }

    @Override
    public void start(Configuration configuration) {
        System.out.println("test2: " + configuration.getSpiName());
    }
}
