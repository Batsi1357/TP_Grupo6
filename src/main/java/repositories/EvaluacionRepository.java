package repositories;

import entities.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluacionRepository extends JpaRepository<Evaluacion,Integer>
{
}
