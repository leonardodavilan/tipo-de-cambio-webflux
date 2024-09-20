package pe.com.leonardodavila.tipodecambiowebflux.domain.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.leonardodavila.tipodecambiowebflux.domain.model.ExchangeRecord;

@Repository
public interface ExchangeRecordRepository extends ReactiveCrudRepository<ExchangeRecord, Long> {
}