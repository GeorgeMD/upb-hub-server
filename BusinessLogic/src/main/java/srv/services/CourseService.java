package srv.services;

import org.springframework.stereotype.Service;
import srv.entities.CourseEntity;
import srv.entities.ProfCourseEntity;
import srv.entities.ProfessorEntity;
import srv.repositories.ProfCourseRepo;
import srv.repositories.ProfRepo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author GeorgeMD
 */
@Service
public class CourseService {

    private ProfCourseRepo profCourseRepo;
    private ProfRepo profRepo;

    public CourseService(ProfRepo profRepo, ProfCourseRepo profCourseRepo) {
        this.profRepo = profRepo;
        this.profCourseRepo = profCourseRepo;
    }

    public List<CourseEntity> getCoursesByProfId(int profId) {
        ProfessorEntity prof = profRepo.findOne(profId);
        Collection<ProfCourseEntity> profCourseEntities =
                profCourseRepo.findAllByProfessor(prof);

        List<CourseEntity> courses = new LinkedList<>();

        profCourseEntities.forEach(profCourse -> {
            courses.add(profCourse.getCourse());
        });

        return courses;
    }
}
