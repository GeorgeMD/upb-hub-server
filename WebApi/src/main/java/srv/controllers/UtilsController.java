package srv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import srv.services.SettingsService;
import srv.utils.Setting;

/**
 * @author GeorgeMD
 */
@RestController
@RequestMapping("/utils")
public class UtilsController {

    private SettingsService settingsService;

    public UtilsController(SettingsService settingsService) {
        this.settingsService = settingsService;
    }

    @GetMapping(params = "version")
    public boolean checkVersion(@RequestParam(name = "version") String version) {
        return settingsService.getByName(Setting.CLIENT_VERSION).getValue().equals(version);
    }
}
