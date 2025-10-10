package serviceImpls;

import entities.Evaluacion;
import services.EvaluacionService;

import java.time.LocalDate;
import java.util.List;

public class EvaluacionServiceImpl implements EvaluacionService
{
    @Override
    public List<Evaluacion> list() {
        return List.of();
    }

    @Override
    public void insert(Evaluacion evaluacion) {

    }

    @Override
    public List<Evaluacion> buscarPorTitulo(String Titulo) {
        return List.of();
    }

    @Override
    public Evaluacion listId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Evaluacion> listarPorFechaInicio(LocalDate FechaInicio) {
        return List.of();
    }

    @Override
    public List<Evaluacion> listarPorDuracionMaxima(float maxDuracion) {
        return List.of();
    }

    @Override
    public List<Evaluacion> listarPorDuracionMinima(float minDuracion) {
        return List.of();
    }
}
