/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jdbc.dao;

import com.javarevolutions.jhs.model.Alumno;
import com.javarevolutions.jsf.bean.AlumnoBean;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface AlumnoDao {
    void insert(Alumno obj);
    void delete(Alumno obj);
    void update(Alumno obj);
    List<Alumno> getAll();
    List<Alumno> getAllByFechas(AlumnoBean bean);
    List<Alumno> getAllByNombre(AlumnoBean bean);
    List<Alumno> buscarByCriterio(AlumnoBean bean);
}
