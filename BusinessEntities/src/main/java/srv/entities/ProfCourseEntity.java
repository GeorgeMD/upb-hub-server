package srv.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author GeorgeMD
 */
@Entity
@Table(name = "ProfCourse", schema = "upb_orar", catalog = "")
public class ProfCourseEntity {
    private int profCourseId;
    private ProfessorEntity professorByProfId;
    private CourseEntity courseByCourseId;
    private Collection<ScheduleEntity> schedulesByProfCourseId;

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
    public ProfessorEntity getProfessorByProfId() {
        return professorByProfId;
    }

    public void setProfessorByProfId(ProfessorEntity professorByProfId) {
        this.professorByProfId = professorByProfId;
    }

    @ManyToOne
    @JoinColumn(name = "CourseId", referencedColumnName = "CourseId", nullable = false)
    public CourseEntity getCourseByCourseId() {
        return courseByCourseId;
    }

    public void setCourseByCourseId(CourseEntity courseByCourseId) {
        this.courseByCourseId = courseByCourseId;
    }

    @OneToMany(mappedBy = "profCourseByProfCourseId")
    public Collection<ScheduleEntity> getSchedulesByProfCourseId() {
        return schedulesByProfCourseId;
    }

    public void setSchedulesByProfCourseId(Collection<ScheduleEntity> schedulesByProfCourseId) {
        this.schedulesByProfCourseId = schedulesByProfCourseId;
    }
}
