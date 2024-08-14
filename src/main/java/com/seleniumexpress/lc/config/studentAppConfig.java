package com.seleniumexpress.lc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages  = "com.seleniumexpress.lc")
public class studentAppConfig implements WebMvcConfigurer{
	@Bean
public InternalResourceViewResolver viewResolver() {
	InternalResourceViewResolver viewres=new InternalResourceViewResolver();
	viewres.setPrefix("/WEB-INF/view/");
	viewres.setSuffix(".jsp");
	return viewres;
}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jd=new JdbcTemplate(dataSource());
		return jd;
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setUsername("root");
		dmds.setPassword("root");
		dmds.setUrl("jdbc:mysql://localhost:3305/newsq");
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dmds;
		
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/URLtoreachresourceFolder/**").addResourceLocations("/resources/");
	}
}
