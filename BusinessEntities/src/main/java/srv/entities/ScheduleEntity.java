package srv.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * @author GeorgeMD
 */
@Entity
@Table(name = "Schedule", schema = "upb_orar", catalog = "")
public class ScheduleEntity {
    private int scheduleId;
    private Date date;
    private Time startHour;
    private Time endHour;
    private String details;
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
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntity that = (ScheduleEntity) o;

        if (scheduleId != that.scheduleId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (startHour != null ? !startHour.equals(that.startHour) : that.startHour != null)
            return false;
        if (endHour != null ? !endHour.equals(that.endHour) : that.endHour != null) return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scheduleId;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (startHour != null ? startHour.hashCode() : 0);
        result = 31 * result + (endHour != null ? endHour.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
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
