package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Table(name="oportunidades")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Oportunidad
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOportunidad;
    private int Intento;
    private LocalDate FechaInicio;
}
