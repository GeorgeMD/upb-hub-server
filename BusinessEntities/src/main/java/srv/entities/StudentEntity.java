package srv.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author GeorgeMD
 */
@Entity
@Table(name = "Student", schema = "upb_orar")
public class StudentEntity {
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Collection<MessageEntity> messages;
    private GroupEntity group;

    @Id
    @Column(name = "StudentId")
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity entity = (StudentEntity) o;

        if (studentId != entity.studentId) return false;
        if (firstName != null ? !firstName.equals(entity.firstName) : entity.firstName != null)
            return false;
        if (lastName != null ? !lastName.equals(entity.lastName) : entity.lastName != null)
            return false;
        if (email != null ? !email.equals(entity.email) : entity.email != null) return false;
        if (phone != null ? !phone.equals(entity.phone) : entity.phone != null) return false;
        if (password != null ? !password.equals(entity.password) : entity.password != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "student")
    public Collection<MessageEntity> getMessages() {
        return messages;
    }

    public void setMessages(Collection<MessageEntity> messages) {
        this.messages = messages;
    }

    @ManyToOne
    @JoinColumn(name = "GroupId", referencedColumnName = "GroupId", nullable = false)
    public GroupEntity getGroup() {
        return group;
    }

    public void setGroup(GroupEntity group) {
        this.group = group;
    }
}
