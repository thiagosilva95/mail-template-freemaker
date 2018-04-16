package com.dev.mail.mailtemplatefreemaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MailTemplateFreemakerApplication implements ApplicationRunner {

	private static Logger log = LoggerFactory.getLogger(MailTemplateFreemakerApplication.class);

	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(MailTemplateFreemakerApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Enviando Email with Freemaker HTML Template Exemple");

		Mail mail = new Mail();

		mail.setFrom("testefreemarker@gmail.com");
		mail.setTo("thiagonascimento95@hotmail.com");
		mail.setSubject("Amor da minha vida");

		Map model = new HashMap();
		model.put("name", "Varoa");
		model.put("location", "Recife");
		model.put("signature", "https://google.com");

		mail.setModel(model);

		emailService.sendSimpleMessage(mail);

        log.info("E-mail enviado");
	}
}
