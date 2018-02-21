package srv.models;

import srv.entities.CourseEntity;

import java.util.LinkedList;
import java.util.List;

/**
 * @author GeorgeMD
 */
public class CourseModel {
    private Integer courseId;
    private String details;
    private String name;
    private String shortName;

    public CourseModel() { }

    public CourseModel(CourseEntity entity) {
        if (entity != null) {
            this.courseId = entity.getCourseId();
            this.details = entity.getDetails();
            this.name = entity.getName();
            this.shortName = entity.getShortName();
        }
    }

    public Integer getCourseId() {
        return courseId;
    }

    public String getDetails() {
        return details;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public static List<CourseModel> transformList(List<CourseEntity> entities) {
        List<CourseModel> models = new LinkedList<>();

        entities.forEach(entity -> models.add(new CourseModel(entity)));

        return models;
    }
}
