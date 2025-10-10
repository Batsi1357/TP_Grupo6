package com.example.tp_grupo6.dtos;

import lombok.Data;

public class SuscripcionCantidadDTO {
    private String nombre;
    private Long cantidad;

    // ✅ Constructor público exacto
    public SuscripcionCantidadDTO(String nombre, Long cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public Long getCantidad() { return cantidad; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCantidad(Long cantidad) { this.cantidad = cantidad; }
}