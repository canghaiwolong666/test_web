package com.dw.test_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName WebController
 * @Author Dingwei
 * @Date 2019/6/12 19:51
 * @Description
 */
@Controller
@RequestMapping("/api")
public class WebController {


    @RequestMapping("/getStr")
    @ResponseBody
    public String getStr(){
        return "哈哈,是我啊";
    }
}
