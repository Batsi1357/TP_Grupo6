package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApunteDto {
    private Integer idApunte;
    private String contenido;
    private LocalDate fechaCreacion;
    private Integer idCliente;
    private Integer idUnidad;
}
