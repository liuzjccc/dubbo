package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.service.DubboProviderTest;

/**
 * @author liuzj
 * @date 2018-12-25
 */
@Service(version = "${demo.service.version}")
public class DubboProviderTestImpl implements DubboProviderTest {

    @Override
    public String hello() {
        return "hello world!";
    }
}
