package org.apache.dubbo.dubbo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author suming
 * @since 2025/4/4 20:18
 */
@SPI
public interface Filter {
    void doFilter();
}
