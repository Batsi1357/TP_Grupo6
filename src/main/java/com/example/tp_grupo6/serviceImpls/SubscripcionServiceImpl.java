package com.example.tp_grupo6.serviceImpls;

import com.example.tp_grupo6.entities.Suscripcion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.tp_grupo6.services.SuscripcionService;
import com.example.tp_grupo6.repositories.SubscripcionRepository;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubscripcionServiceImpl implements SuscripcionService {

    private final SubscripcionRepository  repo;

    @Override
    public List<Suscripcion> listar() {
        return repo.findAll();
    }

    @Override
    public Optional<Suscripcion> obtenerPorId(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Suscripcion guardar(Suscripcion suscripcion) {
        return repo.save(suscripcion);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
