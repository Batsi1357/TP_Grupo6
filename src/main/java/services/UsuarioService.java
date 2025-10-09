package services;

import entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService
{
    public List<Usuario> list();
    public void insert(Usuario usuario);
    public Usuario listId(int id);
    public void delete(int id);
    public void update(Usuario usuario);

}
