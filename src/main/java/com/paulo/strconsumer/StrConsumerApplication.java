package com.paulo.strconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication(scanBasePackages = {"com.paulo.strconsumer", "config"})
public class StrConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrConsumerApplication.class, args);
	}

}
