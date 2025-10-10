package com.example.tp_grupo6.controllers;
import com.example.tp_grupo6.entities.Suscripcion;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.tp_grupo6.services.SuscripcionService;

import java.util.List;

@RestController
@RequestMapping("/api/suscripciones")
@RequiredArgsConstructor
public class SuscripcionController {
    private final SuscripcionService service;

    @GetMapping
    public List<Suscripcion> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Suscripcion> obtener(@PathVariable Integer id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Suscripcion crear(@RequestBody Suscripcion suscripcion) {
        return service.guardar(suscripcion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Suscripcion> actualizar(@PathVariable Integer id, @RequestBody Suscripcion s) {
        return service.obtenerPorId(id)
                .map(existing -> {
                    s.setIdSuscripcion(id);
                    return ResponseEntity.ok(service.guardar(s));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
