package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OportunidadDto {
    private Integer idOportunidad;
    private String titulo;
    private String descripcion;
    private String estado;            // ABIERTA/CERRADA, etc.
    private LocalDate fechaCreacion;
    private Integer idCliente;
    private Integer idUsuarioAsesor;
}
