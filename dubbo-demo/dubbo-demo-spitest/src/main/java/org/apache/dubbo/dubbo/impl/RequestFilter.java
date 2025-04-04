package org.apache.dubbo.dubbo.impl;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.dubbo.Filter;

/**
 * @author suming
 * @since 2025/4/4 20:21
 */
@Activate(group = {CommonConstants.CONSUMER}, value = {"request_count:true"})
public class RequestFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("request filter");
    }
}
