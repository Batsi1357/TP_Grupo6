package serviceImpls;

import entities.Clase;
import services.ClaseService;

import java.util.List;

public class ClaseServiceImpl implements ClaseService
{
    @Override
    public List<Clase> list() {
        return List.of();
    }

    @Override
    public void insert(Clase clase) {

    }

    @Override
    public Clase buscar(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Clase clase) {

    }

    @Override
    public List<Clase> listarPorClasePersonalizada(String ClasePersonalizada) {
        return List.of();
    }
}
