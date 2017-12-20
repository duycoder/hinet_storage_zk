/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hinet.storage.repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author duynn
 * @create_date 20/12/2017
 */
@Repository
public class BaseRepositoryImpl implements BaseRepository {

    @Autowired
    private SessionFactory sessionFactory;

    protected final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    protected final Session openSession() {
        return sessionFactory.openSession();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> getAll(Class<T> clazz) {
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }

    @Override
    public <T> void Save(T clazz) throws DataAccessException {
        getCurrentSession().saveOrUpdate(clazz);
    }

    @Override
    public <T> T findByPrimaryKey(Class<T> klass, Serializable id) {
        return (T) getCurrentSession().get(klass, id);
    }

    @Override
    public <T> T GetUniqueEntityByNamedQuery(String query, Object... params) {
        Query q = getCurrentSession().getNamedQuery(query);
        int i = 1;
        String arg = "arg";
        for (Object o : params) {
            q.setParameter(arg + i, o);
            i++;
        }

        List<T> results = q.list();

        T foundentity = null;
        if (!results.isEmpty()) {
            foundentity = results.get(0);
        }
        return foundentity;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> List<T> GetListByNamedQuery(String query, Object... params) {
        Query q = getCurrentSession().getNamedQuery(query);

        int i = 1;
        String arg = "arg";
        if (params != null) {
            for (Object o : params) {
                if (o != null) {
                    q.setParameter(arg + i, o);
                    i++;
                }
            }
        }

        List<T> list = (List<T>) q.list();
        return list;
    }

    @Override
    public <T> void delete(T clazz) throws DataAccessException {
        getCurrentSession().delete(clazz);
    }

    @Override
    public <T> Long getQueryCount(String query, Object... params) {
        Query q = getCurrentSession().getNamedQuery(query);
        int i = 1;
        String arg = "arg";
        Long count = (long) 0;

        if (params != null) {
            for (Object o : params) {
                if (o != null) {
                    q.setParameter(arg + i, o);
                    i++;
                }
            }
        }
        count = (Long) q.uniqueResult();
        return count;
    }

    @Override
    public <T> List<T> getEntities(Class<T> clazz) {
        Session session = this.openSession();
        String sql = "from " + clazz.getName() + " as e";
        try {
            if (clazz.getDeclaredField("isDelete") != null) {
                sql += " where e.isDelete != true ";
            }
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(BaseRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(BaseRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        sql += " order by e.id desc";

        org.hibernate.query.Query query = session.createQuery(sql);
        List<T> result = query.list();
        session.close();
        return result;
    }
}
