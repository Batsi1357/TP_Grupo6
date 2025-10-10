package com.example.tp_grupo6.services;

import com.example.tp_grupo6.dtos.SuscripcionCantidadDTO;
import com.example.tp_grupo6.entities.OrdenSubscripcion;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface OrdenSubscripcionService
{
    List<OrdenSubscripcion> listar();
    Optional<OrdenSubscripcion> obtenerPorId(Integer id);
    OrdenSubscripcion guardar(OrdenSubscripcion orden);
    void eliminar(Integer id);
    List<OrdenSubscripcion> listarPorSuscripcion(Integer idSuscripcion);
    public void update(OrdenSubscripcion  ordenSubscripcion);
    List<OrdenSubscripcion> listarPorRangoDeFechas(LocalDate FechaInicio, LocalDate FechaFin);
    List<OrdenSubscripcion> listarPorCliente(int idCliente);
    public List<SuscripcionCantidadDTO> quantitytypebySuscripciones() ;
}
