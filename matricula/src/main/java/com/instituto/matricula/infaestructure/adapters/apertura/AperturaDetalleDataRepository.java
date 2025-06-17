package com.instituto.matricula.infaestructure.adapters.apertura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AperturaDetalleDataRepository extends JpaRepository<AperturaDetalleData, Long> {
}
