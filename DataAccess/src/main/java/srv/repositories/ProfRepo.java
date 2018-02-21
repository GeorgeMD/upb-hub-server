package srv.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import srv.entities.ProfessorEntity;

/**
 * @author GeorgeMD
 */
@Repository
public interface ProfRepo extends CrudRepository<ProfessorEntity, Integer> {

}
