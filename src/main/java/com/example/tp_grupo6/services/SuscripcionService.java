package com.example.tp_grupo6.services;

import com.example.tp_grupo6.entities.Suscripcion;

import java.util.List;
import java.util.Optional;

public interface SuscripcionService
{
    List<Suscripcion> listar();
    Optional<Suscripcion> obtenerPorId(Integer id);
    Suscripcion guardar(Suscripcion suscripcion);
    void eliminar(Integer id);
}
