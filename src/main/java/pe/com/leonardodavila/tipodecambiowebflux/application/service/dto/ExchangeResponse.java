package pe.com.leonardodavila.tipodecambiowebflux.application.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeResponse {
    private double monto;
    private double montoConvertido;
    private String monedaOrigen;
    private String monedaDestino;
    private double tipoDeCambio;
}