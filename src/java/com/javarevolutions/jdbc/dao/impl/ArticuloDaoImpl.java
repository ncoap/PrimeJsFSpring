/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jdbc.dao.impl;

import com.javarevolutions.jdbc.dao.ArticuloDao;
import com.javarevolutions.jhs.model.Articulo;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author SergioRios
 */
public class ArticuloDaoImpl extends HibernateDaoSupport implements ArticuloDao {

    @Override
    public void insert(Articulo obj) {
        getHibernateTemplate().save(obj);
    }

    @Override
    public void delete(Articulo obj) {
        getHibernateTemplate().delete(obj);
    }

    @Override
    public void update(Articulo obj) {
        getHibernateTemplate().merge(obj);
    }

    @Override
    public List<Articulo> getAll() {
        return getHibernateTemplate().find("from Articulos");
    }
}
