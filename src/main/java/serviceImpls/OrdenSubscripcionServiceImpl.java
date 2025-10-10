package serviceImpls;

import entities.OrdenSubscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.OrdenSubscripcionRepository;
import repositories.SubscripcionRepository;
import services.OrdenSubscripcionService;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrdenSubscripcionServiceImpl implements OrdenSubscripcionService
{
    @Autowired
    private OrdenSubscripcionRepository ordenSubscripcionRepository;

    @Override
    public List<OrdenSubscripcion> list() {
        return List.of();
    }

    @Override
    public void insert(OrdenSubscripcion ordenSubscripcion) {
        ordenSubscripcionRepository.save(ordenSubscripcion);
    }

    @Override
    public OrdenSubscripcion listId(int id) {
        return ordenSubscripcionRepository.findById(id).orElse(null);
    }


    @Override
    public void delete(int id) {
        ordenSubscripcionRepository.deleteById(id);
    }

    @Override
    public void update(OrdenSubscripcion ordenSubscripcion) {
        ordenSubscripcionRepository.save(ordenSubscripcion);
    }

    @Override
    public List<OrdenSubscripcion> listarPorRangoDeFechas(LocalDate FechaInicio, LocalDate FechaFin) {
        return List.of();
    }

    @Override
    public List<OrdenSubscripcion> listarPorCliente(int idCliente) {
        return List.of();
    }
}
