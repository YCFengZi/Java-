package net.zjitc.servlet;

import javax.servlet.*;
import java.io.IOException;

public class AServelt implements Servlet {
    private int count = 0;
    private ServletConfig servletConfig;

    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("init...");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String value = servletConfig.getInitParameter("name");
        System.out.println(value);
        System.out.println(" aServlet count = " + ++count);
        // 当前servlet名字
        String servletName = servletConfig.getServletName();
        System.out.println("servletName = " + servletName);
        // 获取servletContest相关
        String contestPath = servletConfig.getServletContext().getContextPath();
        System.out.println(contestPath);
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
