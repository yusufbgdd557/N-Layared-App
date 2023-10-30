package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger logger;

    private Category[] categories;

    public CategoryManager(CategoryDao categoryDao, Logger logger, Category[] categories) {
        this.categoryDao = categoryDao;
        this.logger = logger;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category categoryName:categories) {
            if(categoryName.getName().equals(category.getName()))
                throw new Exception("There is already category with the same name!");
        }
        categoryDao.add(category);
        logger.log(category.getName());
    }
}
