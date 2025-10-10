package com.example.tp_grupo6.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto {
    private Integer idCliente;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String direccion;
    private String correo;
    private String celular;
    private Integer idUsuario;
}
