package dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnidadDto {
    private Integer id;
    private String titulo;
    private String descripcion;
    private String nivel;
    private String categoria;
    private Integer duracion;
    private Boolean estado;

}
