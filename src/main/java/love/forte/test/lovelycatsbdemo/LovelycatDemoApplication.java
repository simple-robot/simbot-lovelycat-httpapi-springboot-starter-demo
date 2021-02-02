package love.forte.test.lovelycatsbdemo;

import love.forte.simbot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSimbot
@SpringBootApplication
public class LovelycatDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LovelycatDemoApplication.class, args);
    }

}
