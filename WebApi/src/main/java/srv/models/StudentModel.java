package srv.models;

import srv.entities.StudentEntity;

/**
 * @author GeorgeMD
 */
public class StudentModel {

    private String phone;
    private String lastName;
    private String firstName;
    private String email;
    private int studentId;
    private int groupId;
    private String groupNumber;

    public StudentModel() { }
    public StudentModel(StudentEntity entity) {
        if (entity != null) {
            this.studentId = entity.getStudentId();
            this.groupId = entity.getGroup().getGroupId();
            this.email = entity.getEmail();
            this.firstName = entity.getFirstName();
            this.lastName = entity.getLastName();
            this.phone = entity.getPhone();
            this.groupNumber = entity.getGroup().getNumber();
        }
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public int getGroupId() {
        return groupId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
