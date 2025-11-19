package manueljesus.datalab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DataLabApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataLabApplication.class, args);
    }
}
