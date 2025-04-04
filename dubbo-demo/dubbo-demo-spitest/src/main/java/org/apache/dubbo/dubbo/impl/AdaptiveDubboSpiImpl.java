package org.apache.dubbo.dubbo.impl;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.dubbo.common.Configuration;
import org.apache.dubbo.dubbo.DubboSpiInterface;

/**
 * @author suming
 * @since 2025/4/4 11:08
 */
@Adaptive
public class AdaptiveDubboSpiImpl implements DubboSpiInterface {

    @Override
    public String getClassName() {
        return "test1 ";
    }

    @Override
    public void start(Configuration configuration) {
        ExtensionLoader<DubboSpiInterface> extensionLoader = ExtensionLoader.getExtensionLoader(DubboSpiInterface.class);
        DubboSpiInterface extension = extensionLoader.getExtension(configuration.getSpiName());
        extension.start(configuration);
        System.out.println("adaptive: " + configuration.getSpiName());

    }
}
