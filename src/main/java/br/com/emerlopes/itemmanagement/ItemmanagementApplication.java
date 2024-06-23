package br.com.emerlopes.itemmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients({"br.com.emerlopes.itemmanagement.infrastructure.*"})
public class ItemmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemmanagementApplication.class, args);
    }

}
