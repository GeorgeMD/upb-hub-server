package srv.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import srv.entities.ScheduleEntity;
import srv.services.ScheduleService;

/**
 * @author GeorgeMD
 */
@RestController
public class ScheduleController {

    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping(path = "/schedule", params = "groupId")
    public String getSchedulesByGroup(@RequestParam(name = "groupId") int groupId, Model model) {
        return "schedule";
    }
}
