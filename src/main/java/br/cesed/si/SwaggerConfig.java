package br.cesed.si;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



import java.util.ArrayList;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket produzApi() 
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors
						.basePackage("br.cesed.si"))
				.paths(PathSelectors.any()).build()
				.apiInfo(metaInfo());			
	}

	
	
	@SuppressWarnings("rawtypes")
	private ApiInfo metaInfo() 
	{
		ApiInfo apiInfo = new ApiInfo(
				"Javaria API REST",
                "API REST de uma Padaria",
                "1.0",
                "Terms of Service",
                new springfox.documentation.service.Contact("Matheus Rodrigues", "",
                        "matheus.rsousa16@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html",new ArrayList<VendorExtension>());
		return apiInfo;
	}
}
