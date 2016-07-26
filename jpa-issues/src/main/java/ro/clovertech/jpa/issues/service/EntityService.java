package ro.clovertech.jpa.issues.service;

import java.util.List;
import java.util.Map;

/**
 * Entity Service interface that contains all CRUD methods and is parameterized
 * to work on all types of entities. Also contains methods that execute generic
 * named queries and generic named updates.
 * @author Catalin Mihalache
 *
 * @param <Ent> Generic type for entities.
 */
public interface EntityService<Ent> {
    /**
     * Method used to persist an entity.
     * @param ent entity to be persisted.
     */
    void create(Ent ent);

    /**
     * Method that returns an entity based on the id it is persisted.
     * @param id - id of the entity to be returned.
     * @return The entity with the given id, if any.
     */
    Ent read(long id);

    /**
     * Update a persisted entity by giving a new entity.
     * @param ent New entity to be persisted by given entity id.
     * @return The updated entity.
     */
    Ent update(Ent ent);

    /**
     * Deletes a persisted entity based on it's id.
     * @param id Id of the entity to be deleted.
     */
    void delete(long id);

    /**
     * Method that executes a named query without bind parameters.
     * @param queryName name of the namedQuery to be executed.
     * @param <T> generic type to be returned.
     * @return a list of the results.
     */
    <T> List<T> executeNamedQuery(String queryName);

    /**
     * Method that executes a named query with bind parameters.
     * @param queryName name of the namedQuery to be executed.
     * @param <T> generic type to be returned.
     * @param params map of parameters to be binded to the namedQuery.
     * @return a list of the results.
     */
    <T> List<T> executeNamedQuery(String queryName, Map<String, ?> params);

    /**
     * Method that executes a named query update without bind parameters.
     * @param queryName name of the namedQuery to be executed.
     * @return how many rows were modified.
     */
    int executeNamedUpdate(String queryName);

    /**
     * Method that executes a named query update with bind parameters.
     * @param queryName name of the namedQuery to be executed.
     * @param params map of parameters to be binded to the namedQuery.
     * @return how many rows were modified.
     */
    int executeNamedUpdate(String queryName, Map<String, ?> params);

}
