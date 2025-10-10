package com.example.tp_grupo6.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrdenSubscripcionDto {
    private Integer idOrdenSubscripcion;
    private String estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Integer idSuscripcion;
}