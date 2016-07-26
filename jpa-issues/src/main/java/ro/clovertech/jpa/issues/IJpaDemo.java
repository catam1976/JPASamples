package ro.clovertech.jpa.issues;

import javax.persistence.EntityManager;

@FunctionalInterface
public interface IJpaDemo {
    void doIt(EntityManager em);
}
