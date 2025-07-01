package com.example.week10;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI(){
        Info info = new Info()
                .title("Result API")
                .version("0.0.1")
                .description("<h3>Result Service Swagger</h3>");

        return new OpenAPI()
                .info(info);
    }
}
