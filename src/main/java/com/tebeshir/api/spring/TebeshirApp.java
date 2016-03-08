package com.tebeshir.api.spring;

import com.tebeshir.api.persistence.setup.MyApplicationContextInitializer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@Import({ // @formatter:off
		TebeshirContextConfig.class,
		TebeshirPersistenceJpaConfig.class,
		TebeshirServiceConfig.class,
		TebeshirWebConfig.class
}) // @formatter:on
public class TebeshirApp extends SpringBootServletInitializer {

	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}

	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
		final ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet(), "/api/*");

		final Map<String, String> params = new HashMap<String, String>();
		params.put("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
		params.put("contextConfigLocation", "org.spring.sec2.spring");
		params.put("dispatchOptionsRequest", "true");
		registration.setInitParameters(params);

		registration.setLoadOnStartup(1);
		return registration;
	}

	//

	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.initializers(new MyApplicationContextInitializer()).sources(TebeshirApp.class);
	}

	public static void main(final String... args) {
		new SpringApplicationBuilder(TebeshirApp.class).initializers(new MyApplicationContextInitializer()).run(args);
	}
}
