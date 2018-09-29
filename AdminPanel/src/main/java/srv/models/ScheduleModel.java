package srv.models;

import srv.entities.ScheduleEntity;

import java.sql.Time;

/**
 * @author GeorgeMD
 */
public class ScheduleModel {

    private Integer scheduleId;
    private String details;
    private Time endHour;
    private Time startHour;
    private int profId;
    private int courseId;
    private int profCourseId;
    private String location;
    private String address;

    public ScheduleModel() { }
    public ScheduleModel(final ScheduleEntity entity) {
        if (entity != null) {
            this.scheduleId = entity.getScheduleId();
            this.details = entity.getDetails();
            this.endHour = entity.getEndHour();
            this.startHour = entity.getStartHour();
            this.location = entity.getLocationByLocationId().getName();
            this.address = entity.getLocationByLocationId().getAddress();
            this.profCourseId = entity.getProfCourseByProfCourseId().getProfCourseId();
            this.courseId = entity.getProfCourseByProfCourseId().getCourse().getCourseId();
            this.profId = entity.getProfCourseByProfCourseId().getProfessor().getProfessorId();
        }
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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
}
