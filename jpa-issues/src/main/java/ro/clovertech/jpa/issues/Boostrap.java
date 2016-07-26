package ro.clovertech.jpa.issues;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import ro.clovertech.jpa.issues.model.Item;

/**
 * Starts this JPA sampler application.
 * @author Catalin Mihalache
 *
 */
public abstract class Boostrap {
    private static final Logger LOGGER = Logger.getLogger(Boostrap.class);

    /**
     * App's main entry point.
     * @param args no args
     */
    public static void main(String[] args) {

        if (args.length <= 0) {
            LOGGER.error("Demo id parameter is missing.");
            return;
        }

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("caveatEmptor");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        List<Item> items = entityManager.createQuery("SELECT i FROM Item i where i.name like :name", Item.class)
                .setParameter("name", "%art%").getResultList();

        System.err.println(items.size());

        entityManager.close();
        entityManagerFactory.close();
    }
}
