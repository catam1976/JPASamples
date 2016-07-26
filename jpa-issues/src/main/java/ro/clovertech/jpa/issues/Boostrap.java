package ro.clovertech.jpa.issues;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            sb.append("Item name: ").append(item.getName()).append("; categories: ");

            for (Category category : item.getCategories()) {
                sb.append("[").append(category.getName()).append("]");
            }

            sb.append("\n");
        }
    }
}
