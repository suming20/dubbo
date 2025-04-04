package org.apache.dubbo.dubbo;

import org.apache.dubbo.common.extension.SPI;
import org.apache.dubbo.dubbo.common.Configuration;

/**
 * @author suming
 * @since 2025/4/4 11:07
 */
@SPI
public interface DubboSpiInterface {

    String getClassName();

    void start(Configuration configuration);

}
