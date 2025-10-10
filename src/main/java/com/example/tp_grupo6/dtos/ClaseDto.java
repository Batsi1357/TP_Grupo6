package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClaseDto {
    private Integer idClase;
    private Boolean clasesPersonalizadas;   // BIT/boolean
    private Integer productoId;             // si es relación real, luego lo cambias a idProducto
    private Integer idUnidad;
}
