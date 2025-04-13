package io.github.shintar0.money_integrator.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import io.github.shintar0.money_integrator.config.MoneyIntegratorConfiguration;

@Service
public class MoneyForwardScraperService {
    
    private final MoneyIntegratorConfiguration moneyIntegratorConfiguration;
    private final WebDriver webDriver;

    public MoneyForwardScraperService(MoneyIntegratorConfiguration moneyIntegratorConfiguration) {
        this.moneyIntegratorConfiguration = moneyIntegratorConfiguration;
        this.webDriver = new ChromeDriver();
    }

    public String scraper() {
        try {
            // MoneyForward for sbi
            webDriver.get("https://ssnb.x.moneyforward.com/users/sign_in");
            // ログインフォーム入力
            WebElement username = webDriver.findElement(By.id("sign_in_session_service_email"));
            username.sendKeys(moneyIntegratorConfiguration.getEmail());
            WebElement password = webDriver.findElement(By.id("sign_in_session_service_password"));
            password.sendKeys(moneyIntegratorConfiguration.getPassword());
            // ログインボタン押下
            webDriver.findElement(By.id("login-btn-sumit")).click();
            WebElement userInfo = webDriver.findElement(By.id("user-infop"));
            WebElement total = userInfo.findElement(By.className("heading-radius-box"));


            return total.getText();
        } finally {
            webDriver.quit();
        }
    }

    
    
}
