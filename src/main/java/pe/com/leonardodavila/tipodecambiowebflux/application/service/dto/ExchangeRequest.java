package pe.com.leonardodavila.tipodecambiowebflux.application.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRequest {
    private double monto;
    private String monedaOrigen;
    private String monedaDestino;
}
