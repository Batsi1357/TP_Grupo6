package services;



import entities.Pregunta;

import java.util.List;

public interface PreguntaService
{
    public List<Pregunta> list();
    public void insert(Pregunta pregunta);
    public Pregunta listId(int id);
    public void delete(int id);
    public void update(Pregunta pregunta);
}
