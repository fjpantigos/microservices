package com.instituto.matricula.domain.model.apertura;

import java.util.List;

public interface AperturaDetalleRepository {
    List<AperturaDetalle> findByAperturaId(String uidApertura);
    AperturaDetalle save(AperturaDetalle aperturaDetalle);
}
