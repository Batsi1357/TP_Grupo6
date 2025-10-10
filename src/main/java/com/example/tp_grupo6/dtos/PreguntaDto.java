package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreguntaDto {
    private Integer idPregunta;
    private String enunciado;
    private Integer nivel;
    private Integer idClase;
}
