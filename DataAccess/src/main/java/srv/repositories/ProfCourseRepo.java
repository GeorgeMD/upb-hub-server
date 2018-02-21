package srv.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import srv.entities.CourseEntity;
import srv.entities.ProfCourseEntity;
import srv.entities.ProfessorEntity;

import java.util.List;

/**
 * @author GeorgeMD
 */
@Repository
public interface ProfCourseRepo extends CrudRepository<ProfCourseEntity, Integer> {
    List<ProfCourseEntity> findAllByProfessor(ProfessorEntity prof);
}
