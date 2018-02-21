package srv.services;

import org.springframework.stereotype.Service;
import srv.entities.SettingsEntity;
import srv.repositories.SettingsRepo;
import srv.utils.Setting;

/**
 * @author GeorgeMD
 */
@Service
public class SettingsService {

    SettingsRepo settingsRepo;

    public SettingsService(SettingsRepo settingsRepo) {
        this.settingsRepo = settingsRepo;
    }

    public SettingsEntity getByName(Setting setting) {
        return settingsRepo.findByName(setting.getName());
    }
}
