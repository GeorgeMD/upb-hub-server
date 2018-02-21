package srv.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author GeorgeMD
 */
@Entity
@Table(name = "Location", schema = "upb_orar")
public class LocationEntity {
    private int locationId;
    private String name;
    private String address;
    private Collection<ScheduleEntity> schedules;

    @Id
    @Column(name = "LocationId")
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationEntity that = (LocationEntity) o;

        if (locationId != that.locationId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = locationId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "locationByLocationId")
    public Collection<ScheduleEntity> getSchedules() {
        return schedules;
    }

    public void setSchedules(Collection<ScheduleEntity> schedules) {
        this.schedules = schedules;
    }
}
