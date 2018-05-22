package com.chain.cloud.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				// .apis(RequestHandlerSelectors.basePackage("org.baeldung.web.controller"))
				 .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
//				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
//				.apiInfo(apiInfo());
	}

//	private ApiInfo apiInfo() {
//		return new ApiInfo("CloudUnit API", "测试Demo", "V1", "",
//				new Contact("John Doe", "www.example.com", "myeaddress@company.com"), "License of API",
//				"", Collections.emptyList());
//	}

	// public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// registry
	// .addResourceHandler("swagger-ui.html")
	// .addResourceLocations("classpath:/META-INF/resources/");
	// registry
	// .addResourceHandler("/webjars/**")
	// .addResourceLocations("classpath:/META-INF/resources/webjars/");
	// }
}
