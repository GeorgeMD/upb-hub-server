package srv.entities;

import javax.persistence.*;
import java.sql.Time;

/**
 * @author GeorgeMD
 */
@Entity
@Table(name = "Schedule", schema = "upb_orar")
public class ScheduleEntity {
    private int scheduleId;
    private Time startHour;
    private Time endHour;
    private String details;
    private String day;
    private int weekParity;
    private int semigroup;
    private GroupEntity groupByGroupId;
    private ProfCourseEntity profCourseByProfCourseId;
    private LocationEntity locationByLocationId;

    @Id
    @Column(name = "ScheduleId")
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Basic
    @Column(name = "StartHour")
    public Time getStartHour() {
        return startHour;
    }

    public void setStartHour(Time startHour) {
        this.startHour = startHour;
    }

    @Basic
    @Column(name = "EndHour")
    public Time getEndHour() {
        return endHour;
    }

    public void setEndHour(Time endHour) {
        this.endHour = endHour;
    }

    @Basic
    @Column(name = "Details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "Day")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Basic
    @Column(name = "weekParity")
    public int getWeekParity() {
        return weekParity;
    }

    public void setWeekParity(int weekParity) {
        this.weekParity = weekParity;
    }

    @Basic
    @Column(name = "semigroup")
    public int getSemigroup() {
        return semigroup;
    }

    public void setSemigroup(int semigroup) {
        this.semigroup = semigroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntity entity = (ScheduleEntity) o;

        if (scheduleId != entity.scheduleId) return false;
        if (startHour != null ? !startHour.equals(entity.startHour) : entity.startHour != null)
            return false;
        if (endHour != null ? !endHour.equals(entity.endHour) : entity.endHour != null)
            return false;
        if (details != null ? !details.equals(entity.details) : entity.details != null)
            return false;
        if (day != null ? !day.equals(entity.day) : entity.day != null) return false;
        if (weekParity != entity.weekParity) return false;
        if (semigroup != entity.semigroup) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scheduleId;
        result = 31 * result + (startHour != null ? startHour.hashCode() : 0);
        result = 31 * result + (endHour != null ? endHour.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (weekParity);
        result = 31 * result + (semigroup);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "GroupId", referencedColumnName = "GroupId", nullable = false)
    public GroupEntity getGroupByGroupId() {
        return groupByGroupId;
    }

    public void setGroupByGroupId(GroupEntity groupByGroupId) {
        this.groupByGroupId = groupByGroupId;
    }

    @ManyToOne
    @JoinColumn(name = "ProfCourseId", referencedColumnName = "ProfCourseId", nullable = false)
    public ProfCourseEntity getProfCourseByProfCourseId() {
        return profCourseByProfCourseId;
    }

    public void setProfCourseByProfCourseId(ProfCourseEntity profCourseByProfCourseId) {
        this.profCourseByProfCourseId = profCourseByProfCourseId;
    }

    @ManyToOne
    @JoinColumn(name = "LocationId", referencedColumnName = "LocationId", nullable = false)
    public LocationEntity getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(LocationEntity locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }
}
