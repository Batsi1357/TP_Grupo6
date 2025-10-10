package serviceImpls;

import entities.Oportunidad;
import services.OportunidadService;

import java.time.LocalDate;
import java.util.List;

public class OportunidadServiceImpl implements OportunidadService
{
    @Override
    public List<Oportunidad> list() {
        return List.of();
    }

    @Override
    public void insert(Oportunidad oportunidad) {

    }

    @Override
    public List<Oportunidad> buscarPorOportunidad(String Intento) {
        return List.of();
    }

    @Override
    public Oportunidad listId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Oportunidad> listarPorFechaInicio(LocalDate FechaIntento) {
        return List.of();
    }
}
