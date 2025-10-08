package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
