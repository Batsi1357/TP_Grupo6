package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenSubscripcionDto {
    private Integer idOrderSubscription;
    private String estado;                // PENDIENTE/PAGADA/ANULADA
    private Double montoTotal;
    private LocalDateTime fechaRegistro;
    private Integer idSuscripcion;
    private Integer idUsuario;
}
