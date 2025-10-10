package serviceImpls;

import entities.Pregunta;
import services.PreguntaService;

import java.util.List;

public class PreguntaServiceImpl implements PreguntaService
{
    @Override
    public List<Pregunta> list() {
        return List.of();
    }

    @Override
    public void insert(Pregunta pregunta) {

    }

    @Override
    public Pregunta listId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Pregunta pregunta) {

    }
}
