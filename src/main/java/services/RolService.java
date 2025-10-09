package services;

import entities.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService
{
    public List<Rol> list();
    public void insert(Rol rol);
    public Rol listId(int id);
    public void delete(int id);
    public void update(Rol rol);
    public Optional<Rol> findByTipoRol(String TipoRol);
}
