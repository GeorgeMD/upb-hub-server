package srv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import srv.entities.ScheduleEntity;
import srv.models.ScheduleModel;
import srv.services.ScheduleService;

import java.util.LinkedList;
import java.util.List;

/**
 * @author GeorgeMD
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping(params = {"groupId", "day"})
    public Iterable<ScheduleModel> getByFilter(@RequestParam(value = "groupId") int id,
                                               @RequestParam(value = "day") String day,
                                               @RequestParam(value = "semigroup") int sg) {

        Iterable<ScheduleEntity> entities = scheduleService.getByFilter(id, day.toLowerCase(), sg);

        List<ScheduleModel> models = new LinkedList<>();
        entities.forEach(entity -> models.add(new ScheduleModel(entity)));

        return models;
    }
}
