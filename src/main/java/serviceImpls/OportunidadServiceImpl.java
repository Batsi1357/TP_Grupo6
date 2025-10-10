package serviceImpls;

import entities.Oportunidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.OportunidadRepository;
import repositories.RolRepository;
import services.OportunidadService;

import java.time.LocalDate;
import java.util.List;
@Service
public class OportunidadServiceImpl implements OportunidadService
{
    @Autowired
    private OportunidadRepository oportunidadRepository;
    @Override
    public List<Oportunidad> list() {
        return oportunidadRepository.findAll();
    }

    @Override
    public void insert(Oportunidad oportunidad) {
        oportunidadRepository.save(oportunidad);
    }

    @Override
    public List<Oportunidad> buscarPorOportunidad(String Intento) {
        return List.of();
    }

    @Override
    public Oportunidad listId(int id) {
        return oportunidadRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        oportunidadRepository.deleteById(id);
    }

    @Override
    public List<Oportunidad> listarPorFechaInicio(LocalDate FechaIntento) {
        return List.of();
    }
}
