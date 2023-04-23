package com.Project.SprinAngular;

import com.Project.SprinAngular.Repository.CustomerRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = CustomerRepo.class)
public class SprinAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinAngularApplication.class, args);
    }
}
