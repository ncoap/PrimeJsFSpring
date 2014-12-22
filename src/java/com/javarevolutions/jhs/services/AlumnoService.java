/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jhs.services;

import com.javarevolutions.jsf.bean.AlumnoBean;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface AlumnoService {
    void insert(AlumnoBean obj);
    void delete(AlumnoBean obj);
    void update(AlumnoBean obj);
    List<AlumnoBean> getAll();
    List<AlumnoBean> getAllByFechas(AlumnoBean obj);
    List<AlumnoBean> getAllByCriterio(AlumnoBean alumno);
}
