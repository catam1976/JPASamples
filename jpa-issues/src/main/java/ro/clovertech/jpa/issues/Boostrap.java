package ro.clovertech.jpa.issues;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import ro.clovertech.jpa.issues.model.Category;
import ro.clovertech.jpa.issues.model.Item;

/**
 * Starts this JPA sampler application.
 * @author Catalin Mihalache
 *
 */
public abstract class Boostrap {
    private static final Logger LOGGER = Logger.getLogger(Boostrap.class);

    private static final Map<String, IJpaDemo> DEMOS;

    static {
        DEMOS = new HashMap<>();

        DEMOS.put("doNPlus1FirstCase", Boostrap::doNPlus1FirstCase);
        DEMOS.put("doNPlus1SecondCase", Boostrap::doNPlus1SecondCase);
        DEMOS.put("doNPlus1FirstCaseSolution", Boostrap::doNPlus1FirstCaseSolution);
    }

    /**
     * App's main entry point.
     * @param args no args
     */
    public static void main(String[] args) {

        if (args.length <= 0 || null == DEMOS.get(args[0])) {
            LOGGER.error("Demo id parameter is missing or invalid.");
            return;
        }

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("caveatEmptor");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // ******************************************************************
        LOGGER.info("******************************************************************");
        LOGGER.info("******************************************************************");
        LOGGER.info("******************************************************************");

        IJpaDemo jpaDemo = DEMOS.get(args[0]);
        jpaDemo.doIt(entityManager);

        LOGGER.info("******************************************************************");
        LOGGER.info("******************************************************************");
        LOGGER.info("******************************************************************");
        // LOGGER.info(sb.toString());

        // ******************************************************************

        entityManager.close();
        entityManagerFactory.close();
    }

    /**
     * N + 1 demo - 1st case
     * 
     * @param entityManager
     */
    public static void doNPlus1FirstCase(EntityManager entityManager) {
        List<Item> items = entityManager.createQuery("SELECT i FROM Item i", Item.class).getResultList();

        StringBuilder sb = new StringBuilder();

        for (Item item : items) {
            sb.append("Item: [").append(item.getName()).append("/").append(item.getId()).append("]; categories: ");

            for (Category category : item.getCategories()) {
                sb.append("[").append(category.getName()).append("]");
            }

            sb.append("\n");
        }

        LOGGER.info(sb.toString());
    }

    /**
     * N + 1 demo - 2nd case
     * 
     * @param entityManager
     */
    public static void doNPlus1SecondCase(EntityManager entityManager) {

        List<Category> categories = entityManager.createQuery("SELECT c FROM Category c", Category.class)
                .getResultList();

        LOGGER.info("There are " + categories.size() + " categories");

    }

    /**
     * N + 1 demo - 1st case - solution
     * 
     * @param entityManager
     */
    public static void doNPlus1FirstCaseSolution(EntityManager entityManager) {
        List<Item> items = entityManager.createQuery("SELECT i FROM Item i join fetch  i.categories c", Item.class)
                .getResultList();

        // eliminate duplicated items & merge categories:
        items = items.stream().collect(Collectors.toMap(item -> item.getId(), item -> item, (item1, item2) -> item1))
                .values().stream().collect(Collectors.toList());
        
        // gets item names and their categories:
        StringBuilder sb = new StringBuilder();

        for (Item item : items) {
            sb.append("Item: [").append(item.getName()).append("/").append(item.getId()).append("]; categories: ");

            for (Category category : item.getCategories()) {
                sb.append("[").append(category.getName()).append("]");
            }

            sb.append("\n");
        }

        LOGGER.info(sb.toString());
    }

}
