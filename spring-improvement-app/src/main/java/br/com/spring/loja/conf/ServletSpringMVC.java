package br.com.spring.loja.conf;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class, JPAConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter EncodingFilter = new CharacterEncodingFilter();
		EncodingFilter.setEncoding("UTF-8");
		return new Filter[] {EncodingFilter};		
	}
	
	protected void customizeRegistration(javax.servlet.ServletRegistration.Dynamic registration) {
		registration.setMultipartConfig(new MultipartConfigElement(""));
	}
}
