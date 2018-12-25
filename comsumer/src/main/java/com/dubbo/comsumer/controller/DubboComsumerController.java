package com.dubbo.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.service.DubboProviderTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboComsumerController {

    @Reference(version = "${demo.service.version}")
    private DubboProviderTest dubboProviderTest;

    @GetMapping("hello")
    public String hello() {
        return dubboProviderTest.hello();
    }
}
