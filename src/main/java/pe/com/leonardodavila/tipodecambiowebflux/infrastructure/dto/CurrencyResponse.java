package pe.com.leonardodavila.tipodecambiowebflux.infrastructure.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class CurrencyResponse {
    private Map<String, Double> rates;

}