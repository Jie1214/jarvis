package com.jarvis.controller;

/**
 * Created by Jie on 2019/3/2.
 *
 * @AUTHOR JIE
 * @date 2019/3/2
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    /**
     * 测试方法
     */
    @RequestMapping(value = "/test.json", method = RequestMethod.GET)
    public String test() {
        return "你好，我叫曹正洁,ok!!";
    }
}
