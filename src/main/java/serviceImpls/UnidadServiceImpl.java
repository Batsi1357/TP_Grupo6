package serviceImpls;

import dtos.UnidadDto;
import services.UnidadService;

import java.util.List;
import java.util.Optional;

public class UnidadServiceImpl implements UnidadService
{
    @Override
    public List<UnidadDto> findAll() {
        return List.of();
    }

    @Override
    public Optional<UnidadDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<UnidadDto> findByCategoria(String categoria) {
        return List.of();
    }

    @Override
    public List<UnidadDto> findByNivel(String nivel) {
        return List.of();
    }

    @Override
    public UnidadDto update(Integer id, UnidadDto unidadDto) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
