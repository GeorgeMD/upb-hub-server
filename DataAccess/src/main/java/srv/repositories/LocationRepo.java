package srv.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import srv.entities.LocationEntity;

/**
 * @author GeorgeMD
 */
@Repository
public interface LocationRepo extends CrudRepository<LocationEntity, Integer> {
}
