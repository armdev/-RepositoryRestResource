package io.project.repositoryrest;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@EnableMongoRepositories("io.project.mongo.repositories")
@ComponentScan(basePackages = {"io.project"})
@EntityScan("io.project.mongo.domain")
@EnableSwagger2
public class RepositoryRestApplication {

    public static void main(String[] args) {
        final SpringApplication application = new SpringApplication(RepositoryRestApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.run(args);
    }
}
