package srv.services;

import org.springframework.stereotype.Service;
import srv.entities.GroupEntity;
import srv.entities.ScheduleEntity;
import srv.repositories.GroupRepo;
import srv.repositories.ScheduleRepo;
import srv.repositories.SettingsRepo;
import srv.utils.Setting;
import srv.utils.TimeUtils;

import java.sql.Date;
import java.time.LocalTime;

/**
 * @author GeorgeMD
 */
@Service
public class ScheduleService {

    private ScheduleRepo scheduleRepo;
    private GroupRepo groupRepo;
    private SettingsRepo settingsRepo;

    public ScheduleService(ScheduleRepo scheduleRepo, GroupRepo groupRepo, SettingsRepo settingsRepo) {
        this.scheduleRepo = scheduleRepo;
        this.groupRepo = groupRepo;
        this.settingsRepo = settingsRepo;
    }

    public Iterable<ScheduleEntity> getByFilter(int groupId, String day, int semigroup) {
        GroupEntity group = groupRepo.findOne(groupId);
        String firstWeek = settingsRepo.findByName(Setting.FIRST_WEEK.getName()).getValue();

        int weekParity = TimeUtils.getWeekParity(firstWeek);

        return scheduleRepo.findAllByFilter(group, day, weekParity, semigroup);
    }
}
