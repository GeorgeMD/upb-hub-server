package srv.models;

import srv.entities.ScheduleEntity;

import java.sql.Time;
import java.util.LinkedList;
import java.util.List;

/**
 * @author GeorgeMD
 */
public class ScheduleModel {

    private Integer scheduleId;
    private String details;
    private Time endHour;
    private Time startHour;
    private String course;
    private String courseShort;
    private String profName;
    private String location;
    private String address;

    public ScheduleModel() { }
    public ScheduleModel(final ScheduleEntity entity) {
        if (entity != null) {
            this.scheduleId = entity.getScheduleId();
            this.details = entity.getDetails();
            this.endHour = entity.getEndHour();
            this.startHour = entity.getStartHour();
            this.course = entity.getProfCourseByProfCourseId().getCourse().getName();
            this.courseShort = entity.getProfCourseByProfCourseId().getCourse().getShortName();
            this.profName = entity.getProfCourseByProfCourseId().getProfessor().getFirstName()
                    + " " + entity.getProfCourseByProfCourseId().getProfessor().getLastName();
            this.location = entity.getLocationByLocationId().getName();
            this.address = entity.getLocationByLocationId().getAddress();
        }
    }

    public String getCourse() {
        return course;
    }

    public String getCourseShort() {
        return courseShort;
    }

    public String getProfName() {
        return profName;
    }

    public String getDetails() {
        return details;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public Time getEndHour() {
        return endHour;
    }

    public Time getStartHour() {
        return startHour;
    }

    public String getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEndHour(Time endHour) {
        this.endHour = endHour;
    }

    public void setStartHour(Time startHour) {
        this.startHour = startHour;
    }

    public static List<ScheduleModel> transformList(Iterable<ScheduleEntity> entities) {
        List<ScheduleModel> models = new LinkedList<>();
        entities.forEach(entity -> models.add(new ScheduleModel(entity)));

        return models;
    }
}
