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
    private byte mon;
    private byte tue;
    private byte wed;
    private byte thu;
    private byte fri;
    private byte sat;
    private byte sun;
    private String extra;
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
    @Column(name = "Mon")
    public byte getMon() {
        return mon;
    }

    public void setMon(byte mon) {
        this.mon = mon;
    }

    @Basic
    @Column(name = "Tue")
    public byte getTue() {
        return tue;
    }

    public void setTue(byte tue) {
        this.tue = tue;
    }

    @Basic
    @Column(name = "Wed")
    public byte getWed() {
        return wed;
    }

    public void setWed(byte wed) {
        this.wed = wed;
    }

    @Basic
    @Column(name = "Thu")
    public byte getThu() {
        return thu;
    }

    public void setThu(byte thu) {
        this.thu = thu;
    }

    @Basic
    @Column(name = "Fri")
    public byte getFri() {
        return fri;
    }

    public void setFri(byte fri) {
        this.fri = fri;
    }

    @Basic
    @Column(name = "Sat")
    public byte getSat() {
        return sat;
    }

    public void setSat(byte sat) {
        this.sat = sat;
    }

    @Basic
    @Column(name = "Sun")
    public byte getSun() {
        return sun;
    }

    public void setSun(byte sun) {
        this.sun = sun;
    }

    @Basic
    @Column(name = "Extra")
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleEntity that = (ScheduleEntity) o;

        if (scheduleId != that.scheduleId) return false;
        if (mon != that.mon) return false;
        if (tue != that.tue) return false;
        if (wed != that.wed) return false;
        if (thu != that.thu) return false;
        if (fri != that.fri) return false;
        if (sat != that.sat) return false;
        if (sun != that.sun) return false;
        if (startHour != null ? !startHour.equals(that.startHour) : that.startHour != null)
            return false;
        if (endHour != null ? !endHour.equals(that.endHour) : that.endHour != null) return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (extra != null ? !extra.equals(that.extra) : that.extra != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scheduleId;
        result = 31 * result + (startHour != null ? startHour.hashCode() : 0);
        result = 31 * result + (endHour != null ? endHour.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (int) mon;
        result = 31 * result + (int) tue;
        result = 31 * result + (int) wed;
        result = 31 * result + (int) thu;
        result = 31 * result + (int) fri;
        result = 31 * result + (int) sat;
        result = 31 * result + (int) sun;
        result = 31 * result + (extra != null ? extra.hashCode() : 0);
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
