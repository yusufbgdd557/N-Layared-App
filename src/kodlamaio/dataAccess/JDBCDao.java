package kodlamaio.dataAccess;

import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class JDBCDao implements CourseDao, CategoryDao, InstructorDao{
    @Override
    public void add(Category category) {
        System.out.println("Added to database with JDBC " + category.getName());

    }

    @Override
    public void add(Course course) {
        System.out.println("Added to database with JDBC " + course.getName());

    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Added to database with JDBC " + instructor.getName());

    }
}
