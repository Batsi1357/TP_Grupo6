package services;

import entities.Oportunidad;
import entities.OrdenSubscripcion;

import java.time.LocalDate;
import java.util.List;

public interface OportunidadService
{
    List<Oportunidad> list();
    void insert(Oportunidad oportunidad);
    List<Oportunidad> buscarPorOportunidad(String Intento);
    Oportunidad listId(int id);
    void delete(int id);
    List<Oportunidad> listarPorFechaInicio(LocalDate FechaIntento);
}
