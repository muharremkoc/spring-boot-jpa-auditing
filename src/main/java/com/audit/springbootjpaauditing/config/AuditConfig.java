package com.audit.springbootjpaauditing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing

public class AuditConfig {
    @Bean
    public AuditorAware<String> myAuditorProvider() {
        return new AuditAwareImpl();
    }
}
