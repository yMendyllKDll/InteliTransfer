package org.com.tokio.repositories;

import org.com.tokio.Entity.taxaTransf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TaxaTransfeRepository extends JpaRepository<taxaTransf, Long> {

    @Query(value = "SELECT C.TAXA FROM TAXATRANSF C " +
            " WHERE :qtdDias between C.DIASDE and C.DIASATE", nativeQuery = true)
    Double findTaxaByDias(@Param("qtdDias") Integer qtdDias);
}