package com.openapi.open.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    @Bean
    public OpenAPI api(){
        return new OpenAPI()
                .info(new Info().title("Test API Rest with OpenAPI-swagger v3").version("1.0 SNAPSHOT")
                        .contact(new Contact().name("Posandoval").url("https://github.com/posandoval")
                                .email("omarsand40@gmail.com"))
                        .license(new License().url("https://www.google.com").name("Google"))
                         .termsOfService("https://www.google.com")
                        .description("API to test conection MySQL with SpringBoot"));
                        }

}
