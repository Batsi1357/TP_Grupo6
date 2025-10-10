package com.example.tp_grupo6.repositories;

import com.example.tp_grupo6.entities.OrdenSubscripcion;
import com.example.tp_grupo6.dtos.SuscripcionCantidadDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdenSubscripcionRepository extends JpaRepository<OrdenSubscripcion,Integer>
{
    @Query("SELECT o FROM OrdenSubscripcion o WHERE o.suscripcion.idSuscripcion = :idSuscripcion")
    List<OrdenSubscripcion> findBySuscripcionId(Integer idSuscripcion);
    @Query("""
    SELECT new com.example.tp_grupo6.dtos.SuscripcionCantidadDTO(s.nombre, COUNT(o.idOrdenSubscripcion))
    FROM OrdenSubscripcion o
    JOIN o.suscripcion s
    GROUP BY s.nombre
""")
    List<SuscripcionCantidadDTO> quantitytypebySuscripciones();
}
