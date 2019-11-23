package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.URL;
import java.nio.file.Paths;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("1-7小组：OOAD桃园结义", "www.my.com", "my@my.com");
        return new ApiInfoBuilder()
                .title("Restful API设计（本次作业11个模块，1-7小组选择goods、comment、couponAndGroupon三个模块完善API）")
                .description("litemall controller层API更改为restful风格（未特殊标明则为外部接口）")
                .contact(contact)   // 联系方式
                .version("2.1.0")  // 版本
                .build();
    }



}