package com.example.tp_grupo6.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="subscripciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscripcion
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubscripcion;
    private String Nombre;
    private String Descripcion;
    private Float Precio;
    @JsonIgnore
    @OneToMany(mappedBy = "subscripcionid", fetch = FetchType.EAGER )
    @ToString.Exclude
    private List<OrdenSubscripcion> ordenSubscripcion;
}
