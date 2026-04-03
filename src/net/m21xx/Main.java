package net.m21xx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Scheduled(cron = "0 * * * * *")
    public void runEveryMinute() {
        logger.info("Scheduled task executed at: {}", java.time.LocalDateTime.now());
    }

    @Scheduled(cron = "0 */5 * * * *")
    public void runEveryFiveMinutes() {
        logger.error("Exception occurred", new Exception());
    }
}