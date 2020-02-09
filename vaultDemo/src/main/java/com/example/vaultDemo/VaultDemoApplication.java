package com.example.vaultDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(VaultConfiguration.class)
public class VaultDemoApplication implements CommandLineRunner {
	private final VaultConfiguration configuration;

	public VaultDemoApplication(VaultConfiguration configuration) {
		this.configuration = configuration;
	}

	public static void main(String[] args) {

		SpringApplication.run(VaultDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger logger = LoggerFactory.getLogger(VaultDemoApplication.class);
		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   example.username is {}", configuration.getUsername());
		logger.info("   example.password is {}", configuration.getPassword());
		logger.info("----------------------------------------");

	}
}
