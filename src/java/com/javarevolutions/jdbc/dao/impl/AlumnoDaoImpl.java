/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jdbc.dao.impl;

import com.javarevolutions.jdbc.dao.AlumnoDao;
import com.javarevolutions.jhs.model.Alumno;
import com.javarevolutions.jsf.bean.AlumnoBean;
import java.util.Date;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author SergioRios
 */
public class AlumnoDaoImpl extends HibernateDaoSupport implements AlumnoDao {
    @Override
    public void insert(Alumno obj) {
        getHibernateTemplate().save(obj);
    }

    @Override
    public void delete(Alumno obj) {
        getHibernateTemplate().delete(obj);
    }

    @Override
    public void update(Alumno obj) {
        getHibernateTemplate().merge(obj);
    }

    @Override
    public List<Alumno> getAll() {
        return getHibernateTemplate().find("from Alumnos");
    }
    
    private java.sql.Date convertFecha(Date fecha) {
        return new java.sql.Date(fecha.getTime());
    }

    @Override
    public List<Alumno> getAllByFechas(AlumnoBean bean) {
        String query = "from Alumnos al where al.fechaRegistro between '"+
        convertFecha(bean.getFecha1())+"' and '"+convertFecha(bean.getFecha2())+"'";
        System.out.println("Query by fechas : "+query);
        return getHibernateTemplate().find(query);
    }

    @Override
    public List<Alumno> getAllByNombre(AlumnoBean bean) {
        String query = "from Alumnos al where al.nombre = '"+bean.getNombre()+"'";
        System.out.println("Query by Nombre : "+query);
        return getHibernateTemplate().find(query);
    }
    
    @Override
    public List<Alumno> buscarByCriterio(AlumnoBean bean) {
        String query = "from Alumnos al where al." +bean.getCampo()+" "+bean.getCriterio()+" '"+bean.getValue()+"'";
        System.out.println("Query by "+bean.getNombre()+" : "+query);
        return getHibernateTemplate().find(query);
    }
}
