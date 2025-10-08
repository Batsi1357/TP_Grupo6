package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="respuestas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Respuesta
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;
    private String Texto;
    private String PRespuesta;

}
