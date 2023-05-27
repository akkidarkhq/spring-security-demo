package com.org.unoveo.filter;

import com.org.unoveo.service.UserDetailsServiceImpl;

import jakarta.servlet.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Configuration
public class AuthenticationFilter implements Filter {
    @Autowired
    UserDetailsServiceImpl userDetailsService;


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("authentication");
        userDetailsService.loadUserByUsername("akshay");
        chain.doFilter(request, response);
    }
}
