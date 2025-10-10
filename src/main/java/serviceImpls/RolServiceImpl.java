package serviceImpls;

import entities.Rol;
import services.RolService;

import java.util.List;
import java.util.Optional;

public class RolServiceImpl implements RolService
{
    @Override
    public List<Rol> list() {
        return List.of();
    }

    @Override
    public void insert(Rol rol) {

    }

    @Override
    public Rol listId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Rol rol) {

    }

    @Override
    public Optional<Rol> findByTipoRol(String TipoRol) {
        return Optional.empty();
    }
}
