package pe.com.leonardodavila.tipodecambiowebflux.application.service;

import org.springframework.stereotype.Service;
import pe.com.leonardodavila.tipodecambiowebflux.application.service.dto.ExchangeRequest;
import pe.com.leonardodavila.tipodecambiowebflux.application.service.dto.ExchangeResponse;
import pe.com.leonardodavila.tipodecambiowebflux.domain.service.CurrencyConversionDomainService;

@Service
public class CurrencyExchangeService {


    private final CurrencyConversionDomainService domainService;

    public CurrencyExchangeService(CurrencyConversionDomainService domainService) {
        this.domainService = domainService;
    }

    public ExchangeResponse convertCurrency(ExchangeRequest request) {
        return domainService.convert(request);
    }

}
