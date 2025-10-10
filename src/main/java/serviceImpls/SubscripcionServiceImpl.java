package serviceImpls;

import entities.Subscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.SubscripcionRepository;
import services.SubscripcionService;
import services.UnidadService;

import java.util.List;
@Service
public class SubscripcionServiceImpl implements SubscripcionService
{
    @Autowired
    private SubscripcionRepository subscripcionRepository;
    @Override
    public List<Subscripcion> list()
    {
        return subscripcionRepository.findAll();
    }
    @Override
    public void insert(Subscripcion suscripcion)
    {
        subscripcionRepository.save(suscripcion);
    }
    @Override
    public Subscripcion buscar(int id)
    {
        return subscripcionRepository.findById(id).orElse(null);
    }
    @Override
    public void delete(int id)
    {
        subscripcionRepository.deleteById(id);
    }
    @Override
    public void update(Subscripcion suscripcion)
    {
        subscripcionRepository.save(suscripcion);
    }
    @Override
    public List<String[]> quantitytypebySuscripciones()
    {

        return List.of();
    }
}
