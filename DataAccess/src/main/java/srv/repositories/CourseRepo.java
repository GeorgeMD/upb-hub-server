package srv.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import srv.entities.CourseEntity;

/**
 * @author GeorgeMD
 */
@Repository
public interface CourseRepo extends CrudRepository<CourseEntity, Integer> {
}
