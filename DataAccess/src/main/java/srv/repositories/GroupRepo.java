package srv.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import srv.entities.GroupEntity;

/**
 * @author GeorgeMD
 */
@Repository
public interface GroupRepo extends CrudRepository<GroupEntity, Integer> {
}
