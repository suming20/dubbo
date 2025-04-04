package org.apache.dubbo.jdk.impl;

import org.apache.dubbo.jdk.JdkSpiInterface;

/**
 * @author suming
 * @since 2025/4/4 11:08
 */
public class Test1SpiImpl implements JdkSpiInterface {

    @Override
    public String getClassName() {
        return "test1 ";
    }
}
