package com.wanglei.study.gupao.day05.job.spring;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet extends HttpServlet {

    private List<Handler> handerMapping = new ArrayList<Handler>();
    public void init() throws ServletException{
        try{
            Class<?> memberControllerClass = MemberController.class;
            handerMapping.add(new Handler().setController(memberControllerClass.newInstance())
            .setMethod(memberControllerClass.getMethod("getMemberById",new Class[]{String.class})).setUrl("/web/getMemberById.json"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String url = request.getRequestURI();
        Handler handler = null;
        for (Handler h:handerMapping) {
            if(url.equals(h.getUrl())){
                handler=h;
                break;
            }
        }
        Object object = null;
        object = handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            doDispatch(req, resp);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Handler{
    private Object controller;
    private Method method;
    private String url;

    public Object getController() {
        return controller;
    }

    public Handler setController(Object controller) {
        this.controller = controller;
        return this;
    }

    public Method getMethod() {
        return method;
    }

    public Handler setMethod(Method method) {
        this.method = method;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Handler setUrl(String url) {
        this.url = url;
        return this;
    }
}