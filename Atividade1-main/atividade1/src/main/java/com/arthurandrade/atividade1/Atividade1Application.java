package com.arthurandrade.atividade1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
public class Atividade1Application {

	private static final Logger log = LoggerFactory.getLogger(Atividade1Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Atividade1Application.class, args);

		

		log.info("--->Atividade 1<------");

	}

	@Bean
	public Docket docket() {
	  return new Docket(DocumentationType.OAS_30)
		  .apiInfo(new ApiInfoBuilder()
			  .title("Atividade 1")
			  .description("API Atividade 1 ")
			  .version("0.0.1-SNAPSHOT")
			  .license("MIT")
			  .licenseUrl("https://opensource.org/licenses/MIT")
			  .build())
		  .select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
		  .build();
	}

}
