package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
    private LocalDate Fecha;
    private int Duracion;

}
