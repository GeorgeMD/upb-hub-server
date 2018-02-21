package srv.entities;

import javax.persistence.*;

/**
 * @author GeorgeMD
 */
@Entity
@Table(name = "Settings", schema = "upb_orar")
public class SettingsEntity {
    private int id;
    private String name;
    private String value;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "Value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
