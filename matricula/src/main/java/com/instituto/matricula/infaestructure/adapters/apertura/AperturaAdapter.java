package com.instituto.matricula.infaestructure.adapters.apertura;

import com.instituto.matricula.domain.model.apertura.Apertura;
import com.instituto.matricula.domain.model.apertura.AperturaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AperturaAdapter implements AperturaRepository {
    private final AperturaDataRepository aperturaDataRepository;

    public AperturaAdapter(AperturaDataRepository aperturaDataRepository) {
        this.aperturaDataRepository = aperturaDataRepository;
    }

    @Override
    public List<Apertura> findAll() {
        return List.of();
    }

    @Override
    public Apertura findById(String uid) {
        return null;
    }

    @Override
    public Apertura findByProfesorAndCurso(String uidProfesor, String uidCurso) {
        return null;
    }

    @Override
    public Apertura save(Apertura apertura) {
        return null;
    }
}
