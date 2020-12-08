package com.demo;

import com.demo.servlet.CountryServlet;
import com.demo.servlet.HelloServlet;
import com.demo.servlet.WelcomeServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoManagerApplication {

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(
				new CountryServlet(), "/country");
		return bean;
	}

/*	@Bean
	public ServletRegistrationBean loginServletRegistrationBean(){
		ServletRegistrationBean bean = new ServletRegistrationBean(
				new LoginServlet(),"/login");
		return bean;
	}*/
	@Bean
	public ServletRegistrationBean helloServletRegistrationBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(
				new HelloServlet(), "/hello");
		return bean;
	}

	@Bean
	public ServletRegistrationBean welcomeServletRegistrationBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(
				new WelcomeServlet(), "/welcome");
		return bean;
	}

	public static void main(String[] args) {

		SpringApplication.run(TodoManagerApplication.class, args);


	}

}

