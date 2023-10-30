package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.InstructorDao;
import kodlamaio.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger logger;

    public InstructorManager(InstructorDao instructorDao, Logger logger) { //Injecting the Repository(Data Access Object - DAO) to the Managager with constructor
        this.instructorDao = instructorDao;
        this.logger = logger;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        logger.log(instructor.getName());
    }
}
