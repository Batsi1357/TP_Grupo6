package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
