package serviceImpls;

import entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UsuarioRepository;
import services.UsuarioService;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> list() {
        return List.of();
    }

    @Override
    public void insert(Usuario usuario) {

    }

    @Override
    public Usuario listId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Usuario usuario) {

    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return Optional.empty();
    }
}
