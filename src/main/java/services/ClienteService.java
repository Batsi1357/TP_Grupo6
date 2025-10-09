package services;

import entities.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService
{
    public List<Cliente> list();
    public void insert(Cliente cliente);
    public Cliente listId(int id);
    public void delete(int id);
    public void update(Cliente cliente);
    public Optional<Cliente> findByEdad(int Edad);
}
