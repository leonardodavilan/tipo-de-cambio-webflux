package pe.com.leonardodavila.tipodecambiowebflux.domain.service;

import org.springframework.stereotype.Service;
import pe.com.leonardodavila.tipodecambiowebflux.application.service.dto.ExchangeRequest;
import pe.com.leonardodavila.tipodecambiowebflux.application.service.dto.ExchangeResponse;
import pe.com.leonardodavila.tipodecambiowebflux.domain.model.ExchangeRecord;
import pe.com.leonardodavila.tipodecambiowebflux.domain.repository.ExchangeRecordRepository;
import pe.com.leonardodavila.tipodecambiowebflux.infrastructure.client.CurrencyExchangeClient;
import pe.com.leonardodavila.tipodecambiowebflux.infrastructure.dto.CurrencyResponse;
import reactor.core.publisher.Mono;

@Service
public class CurrencyConversionDomainService {

    private final CurrencyExchangeClient exchangeClient;
    private final ExchangeRecordRepository repository;

    public CurrencyConversionDomainService(CurrencyExchangeClient exchangeClient, ExchangeRecordRepository repository) {
        this.exchangeClient = exchangeClient;
        this.repository = repository;
    }

    public ExchangeResponse convert(ExchangeRequest request) {
        CurrencyResponse rates = exchangeClient.getExchangeRates(request.getMonedaOrigen());
        double rate = rates.getRates().get(request.getMonedaDestino());
        double convertedAmount = request.getMonto() * rate;
        ExchangeRecord record = new ExchangeRecord(request.getMonto(), request.getMonedaOrigen(), request.getMonedaDestino(), convertedAmount, rate);
        repository.save(record);
        return new ExchangeResponse(request.getMonto(), convertedAmount, request.getMonedaOrigen(), request.getMonedaDestino(), rate);
    }

}
