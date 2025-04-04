package org.apache.dubbo.dubbo.impl;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.dubbo.Filter;

/**
 * @author suming
 * @since 2025/4/4 20:18
 */
@Activate(group = CommonConstants.PROVIDER)
public class AuthFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("auth filter");
    }
}
