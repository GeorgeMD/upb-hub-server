package srv.entities;

import javax.persistence.*;

/**
 * @author GeorgeMD
 */
@Entity
@Table(name = "\"Group\"", schema = "upb_orar", catalog = "")
public class GroupEntity {
    private int groupId;
    private String number;
    private int year;

    @Id
    @Column(name = "GroupId")
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "Number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "Year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupEntity that = (GroupEntity) o;

        if (groupId != that.groupId) return false;
        if (year != that.year) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }
}
