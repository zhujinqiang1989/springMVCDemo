package com.zhujq.learn.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/demo")
public class HelloWorldAnnotationController2 {


    @RequestMapping(value = "/sayhello2/{name}", headers={"!Accept"})
    public String sayHello(@PathVariable(value = "name") String myname) {
        //1、收集参数、验证参数
        //2、绑定参数到命令对象
        //3、将命令对象传入业务对象进行业务处理
        //4、选择下一个页面
        //ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        //mv.addObject("message", myname + "Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        //mv.setViewName("hello");
        return "hello";
    }

}
