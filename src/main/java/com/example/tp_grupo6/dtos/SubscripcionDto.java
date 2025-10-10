package com.example.tp_grupo6.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscripcionDto {
    private Integer idSuscripciones;
    private String tipo;           // mensual/anual/etc.
    private String estado;         // ACTIVA/INACTIVA, etc.
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precio;         // si aplica
    private Integer idUsuario;
}
