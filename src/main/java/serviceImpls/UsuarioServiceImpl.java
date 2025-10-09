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
        return usuarioRepository.findAll();
    }

    @Override
    public void insert(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario listId(int id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void update(Usuario usuario) {
        usuarioRepository.save(usuario);
    }


}
