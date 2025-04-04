package org.apache.dubbo.dubbo.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.dubbo.Cooking;

/**
 * @author suming
 * @since 2025/4/4 20:02
 */
public class GasCooking implements Cooking {
    @Override
    public String stove(URL url) {
        System.out.println("gas cooking");
        return "gas cooking";
    }
}
