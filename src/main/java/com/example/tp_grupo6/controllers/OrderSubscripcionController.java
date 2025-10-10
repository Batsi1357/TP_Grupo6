package com.example.tp_grupo6.controllers;

import com.example.tp_grupo6.dtos.OrdenSubscripcionDto;
import com.example.tp_grupo6.entities.OrdenSubscripcion;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.tp_grupo6.services.OrdenSubscripcionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/OrderSubscripcion")
@CrossOrigin("*")
public class OrderSubscripcionController
{
    @Autowired
    private OrdenSubscripcionService ordenSubscripcionService;

    // ----------- READ: LISTAR TODAS -----------
    @GetMapping
    public List<OrdenSubscripcionDto> listar() {
        return ordenSubscripcionService.list().stream().map(orden -> {
            ModelMapper m = new ModelMapper();
            return m.map(orden, OrdenSubscripcionDto.class);
        }).collect(Collectors.toList());
    }

    // ----------- CREATE -----------
    @PostMapping("/orden/insert")
    public ResponseEntity<OrdenSubscripcion> add(@RequestBody OrdenSubscripcion ordenSubscripcion) {
        if (ordenSubscripcion == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
        }
        ordenSubscripcionService.insert(ordenSubscripcion);
        return new ResponseEntity<>(ordenSubscripcion, HttpStatus.CREATED);
    }

    // ----------- READ: BUSCAR POR ID -----------
    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable("id") Integer id) {
        OrdenSubscripcion ordenSubscripcion = ordenSubscripcionService.listId(id);
        if (ordenSubscripcion == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No existe una orden de suscripción con ID: " + id);
        }
        return ResponseEntity.ok(ordenSubscripcion);
    }

    // ----------- UPDATE -----------
    @PutMapping("/orden/update")
    public ResponseEntity<?> update(@RequestBody OrdenSubscripcion request) {
        OrdenSubscripcion existente = ordenSubscripcionService.listId(request.getIdOrdenSubscripcion());
        if (existente == null) {
            return new ResponseEntity<>("No existe una orden con ID: " + request.getIdOrdenSubscripcion(), HttpStatus.NOT_FOUND);
        }

        ordenSubscripcionService.update(request);
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

    // ----------- DELETE -----------
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Integer id) {
        OrdenSubscripcion ordenSubscripcion = ordenSubscripcionService.listId(id);
        if (ordenSubscripcion == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No existe una orden de suscripción con ID: " + id);
        }
        ordenSubscripcionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
