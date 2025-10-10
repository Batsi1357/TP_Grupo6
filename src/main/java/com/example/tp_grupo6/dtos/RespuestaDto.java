package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespuestaDto {
    private Integer idRespuesta;
    private String texto;
    private Boolean correcta;
    private Integer idPregunta;
}
