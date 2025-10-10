package serviceImpls;

import entities.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.RolRepository;
import repositories.UnidadRepository;
import services.RolService;

import java.util.List;
import java.util.Optional;
@Service
public class RolServiceImpl implements RolService
{
    @Autowired
    private RolRepository rolRepository;
    @Override
    public List<Rol> list() {
        return rolRepository.findAll();
    }

    @Override
    public void insert(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public Rol listId(int id) {
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        rolRepository.deleteById(id);
    }

    @Override
    public void update(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public Optional<Rol> findByTipoRol(String TipoRol) {
        return Optional.empty();
    }
}
