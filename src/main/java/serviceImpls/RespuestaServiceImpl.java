package serviceImpls;

import entities.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.RespuestaRepository;
import services.RespuestaService;

import java.util.List;
@Service
public class RespuestaServiceImpl implements RespuestaService
{
    @Autowired
    private RespuestaRepository respuestaRepository;
    @Override
    public List<Respuesta> list() {
        return List.of();
    }

    @Override
    public void insert(Respuesta respuesta) {

    }

    @Override
    public Respuesta listId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Respuesta respuesta) {

    }
}
