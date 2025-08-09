package org.apache.dubbo.dubbo;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.dubbo.common.Configuration;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author suming
 * @since 2025/4/4 14:15
 */
public class DubboSpiTest {

    @Test
    void test1() {
        ExtensionLoader<DubboSpiInterface> extensionLoader = ExtensionLoader.getExtensionLoader(DubboSpiInterface.class);
        DubboSpiInterface dubbotest1 = extensionLoader.getExtension("dubbotest1");
        System.out.println(dubbotest1.getClassName());
    }

    @Test
    void testAdaptiveExtension() {
        Configuration configuration = new Configuration();
        configuration.setSpiName("dubbotest2");
        ExtensionLoader<DubboSpiInterface> extensionLoader = ExtensionLoader.getExtensionLoader(DubboSpiInterface.class);
        DubboSpiInterface spiInterface = extensionLoader.getAdaptiveExtension();
        spiInterface.start(configuration);
    }

    @Test
    void tesDefaultExtension() {
        ExtensionLoader<Cooking> extensionLoader = ExtensionLoader.getExtensionLoader(Cooking.class);
        Cooking spiInterface = extensionLoader.getDefaultExtension();
        URL url = new URL("", "", -1);
        String stove = spiInterface.stove(url);
        System.out.println(stove);
    }

    // 测试Adaptive由框架生成
    @Test
    void tesAdaptive2() {
        ExtensionLoader<Cooking> extensionLoader = ExtensionLoader.getExtensionLoader(Cooking.class);
        Cooking spiInterface = extensionLoader.getAdaptiveExtension();
        URL url = new URL("dubbo", "localhost", 9999);
        url = url.addParameter("stove", "natual");
        // URL url = URL.valueOf("dubbo://localhost:9999?stove=gas");
        String stove = spiInterface.stove(url);
        System.out.println(stove);
    }

    @Test
    void testActiveExtension() {
        ExtensionLoader<Filter> loader = ExtensionLoader.getExtensionLoader(Filter.class);
        URL url = new URL("", "", -1);
        List<Filter> extension1 = loader.getActivateExtension(url, "");
        for (Filter filter : extension1) {
            filter.doFilter();
        }
        System.out.println("============================");
        // url = url.addParameter("mon", "monitor");
        List<Filter> extension2 = loader.getActivateExtension(url, "mon", CommonConstants.PROVIDER);
        for (Filter filter : extension2) {
            filter.doFilter();
        }
        System.out.println("=============================");
        url = url.addParameter("request_count", "true");
        List<Filter> extension3 = loader.getActivateExtension(url, "", CommonConstants.CONSUMER);
        for (Filter filter : extension3) {
            filter.doFilter();
        }
    }
}
