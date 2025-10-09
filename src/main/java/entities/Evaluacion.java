package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="evaluaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evaluacion
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvaluacion;
    private String Titulo;
    private String Descripcion;
    private LocalDate FechaInicio;
    private int Duracion;
    @JsonIgnore
    @OneToMany(mappedBy = "evaluacion", fetch = FetchType.EAGER )
    @ToString.Exclude
    private List<Pregunta> preguntas;
}
