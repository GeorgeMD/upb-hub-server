package srv.services;

import org.springframework.stereotype.Service;
import srv.entities.StudentEntity;
import srv.repositories.StudentRepo;

/**
 * @author GeorgeMD
 */
@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public StudentEntity login(String email, String password) {
        return studentRepo.getStudentEntityByEmailAndPassword(email, password);
    }
}
