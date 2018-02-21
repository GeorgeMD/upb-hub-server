package srv.repositories;

import org.springframework.data.repository.CrudRepository;
import srv.entities.SettingsEntity;

/**
 * @author GeorgeMD
 */
public interface SettingsRepo extends CrudRepository<SettingsEntity, Integer> {
    SettingsEntity findByName(String name);
}
