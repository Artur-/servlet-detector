package com.vaadin.servletdetector;

import java.util.Set;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class ThrowIfServlet5 implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> c, ServletContext servletContext) throws ServletException {
        throw new ServletException("This application requires Servlet 3 or 4 and the server you are running on ("
                + servletContext.getServerInfo() + ") supports Servlet 5+");
    }

}
