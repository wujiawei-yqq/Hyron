package com.baomidou.ant.configuration;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SuppressWarnings("unchecked")
public class Swagerr2configuration {

    @Bean
    public Docket webApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(testApiInfo())
                .groupName("TestApi")
                .select()
                .paths(Predicates.and(PathSelectors.regex("/test/.*"))).build();
    }

    @Bean
    public Docket adminApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(adminApiInfo())
                .groupName("adminApi")
                .select()
                .paths(Predicates.and(PathSelectors.regex("/admin/.*"))).build();
    }

    private ApiInfo testApiInfo(){
        return new ApiInfoBuilder().title("网站的API文档")
                .description("前期测试代码用接口的定义").version("1.0")
                .contact(new Contact("wjw","","")).build();
    }

    private ApiInfo adminApiInfo(){
        return new ApiInfoBuilder().title("后台管理系统的API文档")
                .description("后台管理系统接口的定义").version("1.0")
                .contact(new Contact("wjw","","")).build();
    }
}
