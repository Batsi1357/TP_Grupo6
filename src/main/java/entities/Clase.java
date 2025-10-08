package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="clases")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clase
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClase;
    private String ClasePersonalizada;

}
