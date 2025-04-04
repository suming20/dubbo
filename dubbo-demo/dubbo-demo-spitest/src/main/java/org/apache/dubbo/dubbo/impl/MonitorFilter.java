package org.apache.dubbo.dubbo.impl;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.dubbo.Filter;

/**
 * @author suming
 * @since 2025/4/4 20:19
 */
@Activate
public class MonitorFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("monitor filter");
    }
}
