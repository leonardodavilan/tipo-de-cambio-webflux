package pe.com.leonardodavila.tipodecambiowebflux.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.com.leonardodavila.tipodecambiowebflux.config.FeignConfig;
import pe.com.leonardodavila.tipodecambiowebflux.infrastructure.dto.CurrencyResponse;



@FeignClient(name = "currency-exchange", url = "https://open.er-api.com/v6", configuration = FeignConfig.class)
public interface CurrencyExchangeClient {

    @GetMapping("/latest/{currency}")
    CurrencyResponse getExchangeRates(@PathVariable("currency") String currency);
}