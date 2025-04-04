package org.apache.dubbo.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author suming
 * @since 2025/4/4 20:01
 */
@SPI("natual")
// @SPI
public interface Cooking {

    @Adaptive({"stove"})
    String stove(URL url);
}
