package ro.clovertech.jpa.issues.model;

import java.util.Date;

import javax.persistence.PrePersist;

/**
 * JPA listener class for the
 * {@link ro.clovertech.jpa.issues.model.User}.
 * @author Catalin Mihalache
 */
public class UserListener {

    /**
     * Sets the creation date before persisting the entity.
     *
     * @param user Targeted entity
     */
    @PrePersist
    public void prePersist(final User user) {
        user.setCreationDate(new Date());
    }

}
