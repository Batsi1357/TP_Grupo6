package com.example.tp_grupo6.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "ordenSubscripciones")
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
    @JsonIgnore
    @ToString.Exclude
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cliente_id", unique = true, nullable = false)
    private Cliente cliente;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name="subscripcion_id")
    private Subscripcion subscripcion;
}
