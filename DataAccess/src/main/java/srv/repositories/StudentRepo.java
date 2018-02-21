package srv.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import srv.entities.StudentEntity;

/**
 * @author GeorgeMD
 */
@Repository
public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {
    StudentEntity getStudentEntityByEmailAndPassword(@Param("email") String email,
                                                     @Param("password") String password);
}
