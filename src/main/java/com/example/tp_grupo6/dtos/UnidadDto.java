package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnidadDto {
    private Integer idUnidad;
    private String titulo;
    private String descripcion;
    private Integer nivel;
    private String categoria;
    private Integer duracion;
}
