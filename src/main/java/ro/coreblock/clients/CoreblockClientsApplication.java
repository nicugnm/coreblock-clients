package ro.coreblock.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = "ro.coreblock.clients.repository")
public class CoreblockClientsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreblockClientsApplication.class, args);
    }

}
