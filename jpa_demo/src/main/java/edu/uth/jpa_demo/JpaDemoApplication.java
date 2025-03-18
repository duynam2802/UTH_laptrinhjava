package edu.uth.jpa_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
        // JPA (Java Persistence API)
        // Đây là chuẩn API của Java giúp làm việc với CSDL
        // dễ dàng không cần SQL
    }

}
