package srv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import srv.entities.CourseEntity;
import srv.models.CourseModel;
import srv.services.CourseService;

import java.util.List;

/**
 * @author GeorgeMD
 */
@RestController
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(path = "/course", params = "profId")
    public List<CourseModel> getCoursesByProfId(@RequestParam(name = "profId") int id) {
        List<CourseEntity> entities = courseService.getCoursesByProfId(id);

        return CourseModel.transformList(entities);
    }
}
