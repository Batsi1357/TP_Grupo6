package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="Unidades")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Unidad
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUnidad;
    private String Titulo;
    private String Descripcion;
    private int Nivel;
    private String Categoria;
    private int Duracion;
    private String Estado;

    @JsonIgnore
    @OneToMany(mappedBy = "unidadid", fetch = FetchType.EAGER )
    @ToString.Exclude
    private List<Clase> clases;

}
