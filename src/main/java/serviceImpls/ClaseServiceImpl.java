package serviceImpls;

import entities.Clase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ClaseRepository;
import repositories.RolRepository;
import services.ClaseService;

import java.util.List;
@Service
public class ClaseServiceImpl implements ClaseService
{
    @Autowired
    private ClaseRepository claseRepository;
    @Override
    public List<Clase> list() {
        return claseRepository.findAll();
    }

    @Override
    public void insert(Clase clase) {
        claseRepository.save(clase);
    }

    @Override
    public Clase listId(int id) {
        return claseRepository.findById(id).orElse(null);
    }


    @Override
    public void delete(int id) {
        claseRepository.deleteById(id);
    }

    @Override
    public void update(Clase clase) {
        claseRepository.save(clase);
    }

    @Override
    public List<Clase> listarPorClasePersonalizada(String ClasePersonalizada) {
        return List.of();
    }
}
