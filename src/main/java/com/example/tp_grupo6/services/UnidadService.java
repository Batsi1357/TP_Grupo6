package com.example.tp_grupo6.services;

import com.example.tp_grupo6.dtos.UnidadDto;

import java.util.List;
import java.util.Optional;

public interface UnidadService {

    List<UnidadDto> findAll();
    Optional<UnidadDto> findById(Integer id);
    List<UnidadDto> findByCategoria(String categoria);
    List<UnidadDto> findByNivel(String nivel);
    List<UnidadDto> findByEstado(Boolean estado);
    UnidadDto save(UnidadDto unidadDto);
    UnidadDto update(Integer id, UnidadDto unidadDto);
    void deleteById(Integer id);





}
