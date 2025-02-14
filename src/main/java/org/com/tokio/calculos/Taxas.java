package org.com.tokio.calculos;

import org.com.tokio.repositories.TaxaTransfeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
public class Taxas {
    @Autowired
    public TaxaTransfeRepository taxaTransfRepository;

    public Double calcularTaxa(LocalDateTime dataTransferencia) {
        long diasEntre = ChronoUnit.DAYS.between(LocalDateTime.now(), dataTransferencia);
        return taxaTransfRepository.findTaxaByDias((int) diasEntre);
    }

    public Double calcularValorTaxa(Double taxa, Double valor) {
        if (taxa == 0.025) {
            return 3.0;
        } else if (taxa == 0.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
