package org.springproject.crud.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebServletConfig implements WebApplicationInitializer
{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException
    {
        try (AnnotationConfigWebApplicationContext webApplicationContext =
                     new AnnotationConfigWebApplicationContext())
        {
            webApplicationContext.register(SpringConfig.class);
            webApplicationContext.setServletContext(servletContext);
            ServletRegistration.Dynamic servlet =
                    servletContext.addServlet("dispatcher", new DispatcherServlet(webApplicationContext));
            servlet.setLoadOnStartup(1);
            servlet.addMapping("/");
        }
    }
}
