package kodlamaio;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.business.InstructorManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.dataAccess.HibernateDao;
import kodlamaio.dataAccess.JDBCDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Instructor instructor1 = new Instructor(1, "Yusuf");

        Course course1 = new Course(1, "Java Programming", 100);
        Course course2 = new Course(2, "Python Programming", 120);
        Course[] courses = {course1};
        CourseManager courseManager = new CourseManager(new HibernateDao(), new FileLogger(), courses);
        courseManager.add(course2);

        Category category1 = new Category(1, "Programming");
        Category category2 = new Category(2, "Cyber Security");
        Category category3 = new Category(3, "Programming");
        Category[] categories = {category1};
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(),new DatabaseLogger(),categories);
        categoryManager.add(category2);
        categoryManager.add(category3);

        InstructorManager instructorManager = new InstructorManager(new JDBCDao(),new FileLogger());
        instructorManager.add(instructor1);
    }
}