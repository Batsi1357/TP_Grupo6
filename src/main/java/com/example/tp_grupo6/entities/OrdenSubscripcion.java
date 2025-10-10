package com.example.tp_grupo6.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "orden_subscripcion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenSubscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrdenSubscripcion;

    private String estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name = "id_suscripcion")
    private Suscripcion suscripcion;
}