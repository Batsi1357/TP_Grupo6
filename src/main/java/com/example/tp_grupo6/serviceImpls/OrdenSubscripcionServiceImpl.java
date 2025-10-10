package com.example.tp_grupo6.serviceImpls;

import com.example.tp_grupo6.dtos.SuscripcionCantidadDTO;
import com.example.tp_grupo6.entities.OrdenSubscripcion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.tp_grupo6.repositories.OrdenSubscripcionRepository;
import com.example.tp_grupo6.services.OrdenSubscripcionService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrdenSubscripcionServiceImpl implements OrdenSubscripcionService {
    private final OrdenSubscripcionRepository repo;

    @Override
    public List<OrdenSubscripcion> listar() {
        return repo.findAll();
    }

    @Override
    public Optional<OrdenSubscripcion> obtenerPorId(Integer id) {
        return repo.findById(id);
    }

    @Override
    public OrdenSubscripcion guardar(OrdenSubscripcion orden) {
        return repo.save(orden);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public List<OrdenSubscripcion> listarPorSuscripcion(Integer idSuscripcion) {
        return repo.findBySuscripcionId(idSuscripcion);
    }

    @Override
    public void update(OrdenSubscripcion ordenSubscripcion) {

    }

    @Override
    public List<OrdenSubscripcion> listarPorRangoDeFechas(LocalDate FechaInicio, LocalDate FechaFin) {
        return List.of();
    }

    @Override
    public List<OrdenSubscripcion> listarPorCliente(int idCliente) {
        return List.of();
    }
    public List<SuscripcionCantidadDTO> quantitytypebySuscripciones() {
        return repo.quantitytypebySuscripciones();
    }
}
