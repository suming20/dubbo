package org.apache.dubbo.dubbo.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.dubbo.Cooking;

/**
 * @author suming
 * @since 2025/4/4 20:03
 */
public class NatualGasCooking implements Cooking {
    @Override
    public String stove(URL url) {
        System.out.println("natual gas cooking");
        return "natual gas cooking";
    }
}
