package com.User.User_Management_System.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig{
	
	@Bean
    public Docket mainapi(){
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("maincontroller")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.User.User_Management_System.Controller"))
            .build().
            apiInfo(apiInfo()); 
		
	}
	
	@Bean
    public Docket secondapi(){
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("secondcontroller")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.User.User_Management_System.Controller.second.controll"))
            .paths(PathSelectors.ant("/getMsg"))
            .build().
            apiInfo(apiInfo()); 
		
	}

	@Bean
    public Docket thirdapi(){
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("thirdcontroller")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.User.User_Management_System.Controller.third.controll"))
            .build().
            apiInfo(apiInfo()); 
		
	}

	@Bean
    public Docket fourthapi(){
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("fourthcontroller")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.User.User_Management_System.Controller.fourth.controll"))
            .build().
            apiInfo(apiInfo()); 
		
	}

	@Bean
    public Docket fifthapi(){
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("fifthcontroller")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.User.User_Management_System.Controller.fifth.controll"))
            .build().
            apiInfo(apiInfo()); 
		
	}

	@Bean
    public Docket sixthapi(){
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("sixthcontroller")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.User.User_Management_System.Controller.sixth.controll"))
            .build().
            apiInfo(apiInfo()); 
		
	}

	@Bean
    public Docket seventhapi(){
		
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("seventhcontroller")
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.User.User_Management_System.Controller.seventh.controll"))
            .build().
            apiInfo(apiInfo()); 
		
	}
    private ApiInfo apiInfo() {
    	
    	return new ApiInfoBuilder()
    			.title("Spring MVC Docs")
    			.description("MVC documentaion") 
    			.version("1.5")
            .termsOfServiceUrl("http://terms-of-services.url") 
            .license("LICENSE")
            .licenseUrl("http://url-to-license.com")
            .build(); 
    	}


}
