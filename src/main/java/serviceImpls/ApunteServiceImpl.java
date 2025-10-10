package serviceImpls;

import entities.Apunte;
import services.ApunteService;

import java.time.LocalDate;
import java.util.List;

public class ApunteServiceImpl implements ApunteService
{
    @Override
    public List<Apunte> list() {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Apunte listId(int id) {
        return null;
    }

    @Override
    public void insert(Apunte apunte) {

    }

    @Override
    public void update(Apunte apunte) {

    }

    @Override
    public List<Apunte> listarPorFecha(LocalDate FechaCreacion) {
        return List.of();
    }
}
