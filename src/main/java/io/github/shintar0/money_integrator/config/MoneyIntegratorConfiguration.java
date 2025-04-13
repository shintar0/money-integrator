package io.github.shintar0.money_integrator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "money-integrator.money-forward-sbi")
public class MoneyIntegratorConfiguration {
    private String email;
    private String password;
}

