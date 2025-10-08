package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name="apuntes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apunte
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApunte;
    private String Contenido;
    private LocalDate FechaCreacion;

}
