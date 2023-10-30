package kodlamaio.dataAccess;

import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class HibernateDao implements CourseDao, CategoryDao, InstructorDao{

    @Override
    public void add(Category category) {
        System.out.println("Added to database with Hibernate " + category.getName());
    }

    @Override
    public void add(Course course) {
        System.out.println("Added to database with Hibernate " + course.getName());
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Added to database with Hibernate " + instructor.getName());
    }
}
