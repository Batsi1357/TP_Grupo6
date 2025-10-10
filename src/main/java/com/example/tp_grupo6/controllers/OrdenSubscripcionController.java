package com.example.tp_grupo6.controllers;

import com.example.tp_grupo6.dtos.SuscripcionCantidadDTO;
import com.example.tp_grupo6.entities.OrdenSubscripcion;
import com.example.tp_grupo6.repositories.OrdenSubscripcionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.tp_grupo6.repositories.SubscripcionRepository;
import com.example.tp_grupo6.services.OrdenSubscripcionService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ordenes")
@RequiredArgsConstructor
public class OrdenSubscripcionController {
    private final OrdenSubscripcionService service;
    private final SubscripcionRepository susRepo;
    private final OrdenSubscripcionRepository ordenSubscripcionRepository;
    private final OrdenSubscripcionService ordenSubscripcionService;

    @GetMapping
    public List<OrdenSubscripcion> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrdenSubscripcion> obtener(@PathVariable Integer id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/suscripcion/{idSuscripcion}")
    public List<OrdenSubscripcion> listarPorSuscripcion(@PathVariable Integer idSuscripcion) {
        return service.listarPorSuscripcion(idSuscripcion);
    }

    @PostMapping
    public ResponseEntity<OrdenSubscripcion> crear(@RequestBody OrdenSubscripcion orden) {
        if (orden.getSuscripcion() != null && orden.getSuscripcion().getIdSuscripcion() != null) {
            var sus = susRepo.findById(orden.getSuscripcion().getIdSuscripcion())
                    .orElseThrow(() -> new RuntimeException("Suscripción no encontrada"));
            orden.setSuscripcion(sus);
        }
        return ResponseEntity.ok(service.guardar(orden));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdenSubscripcion> actualizar(@PathVariable Integer id, @RequestBody OrdenSubscripcion orden) {
        return service.obtenerPorId(id)
                .map(existing -> {
                    orden.setIdOrdenSubscripcion(id);
                    return ResponseEntity.ok(service.guardar(orden));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/reportes/estadisticas/suscripciones")
    public List<SuscripcionCantidadDTO> quantitytypebySuscripciones() {
        return ordenSubscripcionService .quantitytypebySuscripciones();
    }
}
