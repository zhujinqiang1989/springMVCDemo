package com.zhujq.learn.mvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldWithAbstractController extends AbstractController implements LastModified {

    private long lastModified;
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws Exception {
        System.out.println("handleRequestInternal() - lastModified="+ lastModified);
        //httpServletResponse.getWriter().write("Hello AbstractController");

        httpServletResponse.getWriter().write("<a href=''>this</a>");
        //如果想直接在该处理器/控制器写响应 可以通过返回null告诉DispatcherServlet自己已经写出响应了，不需要它进行视图解析
        return null;
    }

    @Override
    public long getLastModified(HttpServletRequest httpServletRequest) {
        System.out.println("getLastModified() - lastModified="+ lastModified);
        if(lastModified == 0L) {
            //TODO 此处更新的条件：如果内容有更新，应该重新返回内容最新修改的时间戳
            lastModified = System.currentTimeMillis();
        }
        return lastModified;
    }
}
