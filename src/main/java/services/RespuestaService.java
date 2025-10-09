package services;

import entities.Respuesta;

import java.util.List;

public interface RespuestaService
{
    public List<Respuesta> list();
    public void insert(Respuesta respuesta);
    public Respuesta listId(int id);
    public void delete(int id);
    public void update(Respuesta respuesta);
}
