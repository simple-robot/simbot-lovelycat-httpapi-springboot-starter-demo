package love.simbot.example.lovelycatsbdemo;

import love.forte.simbot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSimbot
@SpringBootApplication
public class SimbotExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimbotExampleApplication.class, args);
    }

}
