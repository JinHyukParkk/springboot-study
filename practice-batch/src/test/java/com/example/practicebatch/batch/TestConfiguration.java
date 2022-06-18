package com.example.practicebatch.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableBatchProcessing
@EnableAutoConfiguration
@EntityScan("com.example.practicebatch")
@EnableJpaRepositories("com.example.practicebatch")
@EnableTransactionManagement
public class TestConfiguration {

}
