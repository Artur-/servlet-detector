package com.vaadin.servletdetector;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ThrowIfServlet3 implements ServletContainerInitializer {

    private static final List<String> SERVLET_3_SUPPORTED_SERVERS_EXCLUSIONS =
            Collections.singletonList("WildFly");

    public void onStartup(Set<Class<?>> c, ServletContext servletContext) throws ServletException {
        String serverInfo = servletContext.getServerInfo();
        if (SERVLET_3_SUPPORTED_SERVERS_EXCLUSIONS.stream().noneMatch(serverInfo::contains)) {
            throw new ServletException("This application requires Servlet 5+ and the server you are running on ("
                                       + serverInfo + ") supports Servlet 3");
        }
    }

}
