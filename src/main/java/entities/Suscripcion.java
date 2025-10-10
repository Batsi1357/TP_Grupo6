package com.example.tp_grupo6.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "suscripcion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSuscripcion;

    private String nombre;
    private Double precio;
    private Integer duracion; // en días o meses

    @OneToMany(mappedBy = "suscripcion", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<OrdenSubscripcion> ordenes;
}
