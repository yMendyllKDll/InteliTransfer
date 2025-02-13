package org.com.tokio.repositories;

import org.com.tokio.Entity.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository <Transferencia,Long> {
}
