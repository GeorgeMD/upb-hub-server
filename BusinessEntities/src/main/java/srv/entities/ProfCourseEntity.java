package srv.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author GeorgeMD
 */
@Entity
@Table(name = "ProfCourse", schema = "upb_orar")
public class ProfCourseEntity {
    private int profCourseId;
    private ProfessorEntity professor;
    private CourseEntity course;
    private Collection<ScheduleEntity> schedules;

    @Id
    @Column(name = "ProfCourseId")
    public int getProfCourseId() {
        return profCourseId;
    }

    public void setProfCourseId(int profCourseId) {
        this.profCourseId = profCourseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfCourseEntity that = (ProfCourseEntity) o;

        if (profCourseId != that.profCourseId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return profCourseId;
    }

    @ManyToOne
    @JoinColumn(name = "ProfId", referencedColumnName = "ProfessorId", nullable = false)
    public ProfessorEntity getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorEntity professor) {
        this.professor = professor;
    }

    @ManyToOne
    @JoinColumn(name = "CourseId", referencedColumnName = "CourseId", nullable = false)
    public CourseEntity getCourse() {
        return course;
    }

    public void setCourse(CourseEntity course) {
        this.course = course;
    }

    @OneToMany(mappedBy = "profCourseByProfCourseId")
    public Collection<ScheduleEntity> getSchedules() {
        return schedules;
    }

    public void setSchedules(Collection<ScheduleEntity> schedules) {
        this.schedules = schedules;
    }
}
