package io.github.shintar0.money_integrator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.github.shintar0.money_integrator.service.MoneyForwardScraperService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class MoneyForwardScraperController {
    private final MoneyForwardScraperService moneyForwardScraperService;
    @GetMapping("/scrape/moneyForwardSbi")
    public ResponseEntity<String> scrapeMoneyForwardSbi() {
        try {
            String total = moneyForwardScraperService.scraper();
            return ResponseEntity.ok().body(total);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getLocalizedMessage());
        }
    }
    
}
