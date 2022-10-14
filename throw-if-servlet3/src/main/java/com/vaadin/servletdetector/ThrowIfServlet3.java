package com.vaadin.servletdetector;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ThrowIfServlet3 implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> c, ServletContext servletContext) throws ServletException {
        throw new ServletException("This application requires Servlet 5+ and the server you are running on ("
                + servletContext.getServerInfo() + ") supports Servlet 3");
    }

}
