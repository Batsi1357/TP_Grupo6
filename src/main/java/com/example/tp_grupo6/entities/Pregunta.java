package com.example.tp_grupo6.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="preguntas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pregunta
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;

    private String Enunciado;
    private String Tipo;
    private Float Puntaje;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "evaluacion_id", nullable = false)
    @ToString.Exclude
    @JsonIgnore
    private Evaluacion evaluacion;
    @JsonIgnore
    @ToString.Exclude
    @OneToOne(mappedBy = "pregunta", fetch = FetchType.LAZY)
    private Respuesta respuesta;

}
