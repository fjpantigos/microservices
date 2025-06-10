package com.idat.profesor.infraestructure.entries;

import com.idat.profesor.domain.model.Profesor;
import com.idat.profesor.domain.service.ProfesorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instituto/profesor/")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping
    ResponseEntity<List<Profesor>> findAll() {
        return ResponseEntity.ok(profesorService.findAll());
    }

    @GetMapping("/{uid}")
    ResponseEntity<Profesor> findByUid(@PathVariable("uid") String uid) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(profesorService.findById(uid));
    }
}
