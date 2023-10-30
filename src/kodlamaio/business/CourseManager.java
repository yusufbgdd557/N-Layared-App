package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger logger;

    private Course[] courses;

    public CourseManager(CourseDao courseDao, Logger logger, Course[] courses) {
        this.courseDao = courseDao;
        this.logger = logger;
        this.courses = courses;
    }

    public void add(Course course) throws Exception{
        if(course.getUnitPrice() < 0) {
            throw new Exception("Unit price can not be less than 0!");
        }
        for (Course courseName:courses) {
            if(courseName.getName().equals(course.getName()))
                throw new Exception("There is already course with the same name!");
        }
        courseDao.add(course);
        logger.log(course.getName());
    }
}
