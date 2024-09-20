package pe.com.leonardodavila.tipodecambiowebflux.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ExchangeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double monto;
    private String monedaOrigen;
    private String monedaDestino;
    private double montoConvertido;
    private double tipoDeCambio;

    public ExchangeRecord(double monto, String monedaOrigen, String monedaDestino, double montoConvertido, double tipoDeCambio) {
        this.monto = monto;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.montoConvertido = montoConvertido;
        this.tipoDeCambio = tipoDeCambio;
    }
}
