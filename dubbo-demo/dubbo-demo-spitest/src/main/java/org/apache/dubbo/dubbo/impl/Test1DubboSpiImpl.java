package org.apache.dubbo.dubbo.impl;

import org.apache.dubbo.dubbo.common.Configuration;
import org.apache.dubbo.dubbo.DubboSpiInterface;
import org.apache.dubbo.rpc.Protocol;

/**
 * @author suming
 * @since 2025/4/4 11:08
 */
public class Test1DubboSpiImpl implements DubboSpiInterface {

    private Protocol protocol;

    @Override
    public String getClassName() {
        System.out.println("protocol " + protocol);
        return "test1 ";
    }

    @Override
    public void start(Configuration configuration) {
        System.out.println("test1: " + configuration.getSpiName());
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }
}
