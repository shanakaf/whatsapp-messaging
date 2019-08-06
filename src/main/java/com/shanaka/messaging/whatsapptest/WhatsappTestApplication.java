package com.shanaka.messaging.whatsapptest;

import com.twilio.Twilio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WhatsappTestApplication {

	public static final String ACCOUNT_SID = "";
	public static final String AUTH_TOKEN = "";

	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		SpringApplication.run(WhatsappTestApplication.class, args);
	}

}
