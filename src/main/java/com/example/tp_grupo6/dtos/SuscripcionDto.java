package com.example.tp_grupo6.dtos;

import lombok.Data;

@Data
public class SuscripcionDto {
    private Integer idSuscripcion;
    private String nombre;
    private Double precio;
    private Integer duracion;
}