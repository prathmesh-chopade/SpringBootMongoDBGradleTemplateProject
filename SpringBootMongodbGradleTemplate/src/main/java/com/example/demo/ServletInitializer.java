package com.example.demo;
/**
 * @author Prathmesh Chopade
 *
 * Jul 26, 2020
 */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootMongodbGradleTemplateApplication.class);
	}

}
