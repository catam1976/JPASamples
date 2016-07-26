package ro.clovertech.jpa.issues.service.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ro.clovertech.jpa.issues.service.EntityService;

/**
 * Implementation class for
 * {@link ro.clovertech.jpa.issues.service.EntityService}.
 * @author Catalin Mihalache
 * @param <Entity> .
 */
public class EntityServiceImpl<Entity> implements EntityService<Entity> {

    @PersistenceContext(unitName = "caveatEmptor")
    private EntityManager entityManager;

    private Class<Entity> clazz;

    public EntityServiceImpl(final Class<Entity> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void create(final Entity ent) {
        entityManager.persist(ent);
    }

    @Override
    public Entity read(final long id) {
        return entityManager.find(clazz, id);
    }

    @Override
    public Entity update(final Entity ent) {
        return entityManager.merge(ent);
    }

    @Override
    public void delete(final long id) {
        entityManager.remove(read(id));
    }

    @Override
    public <T> List<T> executeNamedQuery(final String queryName) {
        return executeNamedQuery(queryName, null);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> List<T> executeNamedQuery(final String queryName, final Map<String, ?> params) {
        Query query = entityManager.createNamedQuery(queryName);

        if (null != params) {
            params.forEach((key, value) -> {
                query.setParameter(key, value);
            });
        }

        return query.getResultList();
    }

    @Override
    public int executeNamedUpdate(final String queryName) {
        return executeNamedUpdate(queryName, null);
    }

    @Override
    public int executeNamedUpdate(final String queryName, final Map<String, ?> params) {
        Query query = entityManager.createNamedQuery(queryName);

        if (null != params) {
            params.forEach((key, value) -> {
                query.setParameter(key, value);
            });
        }

        return query.executeUpdate();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
