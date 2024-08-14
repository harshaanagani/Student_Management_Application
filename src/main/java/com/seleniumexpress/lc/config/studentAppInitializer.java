package com.seleniumexpress.lc.config;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@EnableWebMvc
public class studentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arr= {studentAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] str= {"/"};
		return str;
	}

}
