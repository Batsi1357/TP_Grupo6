package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name="ordenSubscripciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenSubscripcion
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrdenSubscripcion;
    private String Estado;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;

}
