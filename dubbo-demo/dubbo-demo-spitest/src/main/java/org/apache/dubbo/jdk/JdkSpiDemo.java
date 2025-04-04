package org.apache.dubbo.jdk;

import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.spi.LocaleServiceProvider;

/**
 * @author suming
 * @since 2025/4/4 11:09
 */
public class JdkSpiDemo {
    public static void main(String[] args) {
        ServiceLoader<JdkSpiInterface> loader = ServiceLoader.load(JdkSpiInterface.class);
        for (JdkSpiInterface next : loader) {
            System.out.println(next.getClassName());
        }
    }
}
