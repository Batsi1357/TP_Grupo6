package serviceImpls;

import dtos.UnidadDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UnidadRepository;
import repositories.UsuarioRepository;
import services.UnidadService;

import java.util.List;
import java.util.Optional;
@Service
public class UnidadServiceImpl implements UnidadService
{
    @Autowired
    private UnidadRepository unidadRepository;

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
