package com.grapheople.lifeisquest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Steven Jee
 * @since v.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.grapheople.lifeisquest")
public class WebApplication {

  public static void main(String[] args) throws Exception{
    SpringApplication.run(WebApplication.class, args);
  }
}
