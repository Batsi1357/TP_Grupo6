package serviceImpls;

import dtos.UnidadDto;
import entities.Unidad;
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
    public List<Unidad> list() {
        return unidadRepository.findAll();
    }

    @Override
    public void insert(Unidad unidad) {
        unidadRepository.save(unidad);
    }

    @Override
    public Unidad listId(int id) {
        return unidadRepository.findById(id).orElse(null);
    }

    @Override
    public Optional<Unidad> findById(Integer id) {
        return unidadRepository.findById(id);
    }

    @Override
    public List<Unidad> findByCategoria(String categoria) {
        return List.of();
    }

    @Override
    public List<Unidad> findByNivel(String nivel) {
        return List.of();
    }

    @Override
    public void update(Unidad unidad) {
        unidadRepository.save(unidad);
    }

    @Override
    public void delete(int id) {
        unidadRepository.deleteById(id);
    }
}
