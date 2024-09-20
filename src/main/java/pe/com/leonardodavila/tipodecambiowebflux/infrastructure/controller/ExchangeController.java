package pe.com.leonardodavila.tipodecambiowebflux.infrastructure.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.leonardodavila.tipodecambiowebflux.application.service.CurrencyExchangeService;
import pe.com.leonardodavila.tipodecambiowebflux.application.service.dto.ExchangeRequest;
import pe.com.leonardodavila.tipodecambiowebflux.application.service.dto.ExchangeResponse;

@RestController
@RequestMapping("/api/v1/exchange")
public class ExchangeController {

    private final CurrencyExchangeService exchangeService;

    public ExchangeController(CurrencyExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @PostMapping("/convert")
    public ExchangeResponse convertCurrency(@RequestBody ExchangeRequest request) {
        return exchangeService.convertCurrency(request);
    }
}
