package dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClaseDto {

    private Integer id;
    private Integer unidadId;
    private String unidadTitulo;
    private Boolean clasesPersonalizadas;



}
