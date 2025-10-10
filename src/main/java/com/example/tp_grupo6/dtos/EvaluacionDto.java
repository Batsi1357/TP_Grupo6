package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvaluacionDto {
    private Integer idEvaluacion;
    private Integer puntaje;       // o Double
    private String comentario;
    private LocalDate fecha;
    private Integer idCliente;
    private Integer idUnidad;
}
