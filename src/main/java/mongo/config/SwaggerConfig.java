package mongo.config;

import com.fasterxml.classmate.TypeResolver;
import com.google.common.base.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by pniel.abramovich on 10/9/2016.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Value("${info.api.version}")
    private String apiVersion;

    @Autowired
    private TypeResolver typeResolver;

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(paths())
                .build()
                .pathMapping("/")
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDate.class,
                        String.class)
                ;
    }

    private Predicate<String> paths() {
        return PathSelectors.any();
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Example Service API For Mongo With Spring Data", "the is the service", apiVersion,
                "Mongo API terms of service", "Mongo",
                "Mongo API Licence Type", "Mongo API License URL");
        return apiInfo;
    }
}
