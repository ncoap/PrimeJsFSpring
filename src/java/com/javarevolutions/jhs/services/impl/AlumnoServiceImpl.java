/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jhs.services.impl;

import com.javarevolutions.jdbc.dao.AlumnoDao;
import com.javarevolutions.jhs.model.Alumno;
import com.javarevolutions.jhs.model.Login;
import com.javarevolutions.jhs.services.AlumnoService;
import com.javarevolutions.jsf.bean.AlumnoBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public class AlumnoServiceImpl implements AlumnoService {
    private AlumnoDao alumnoDAO;
    
    @Override
    public void insert(AlumnoBean obj) {
        Alumno alumno = new Alumno();
        alumno.setMatricula(obj.getMatricula());
        alumno.setNombre(obj.getNombre());
        alumno.setApp(obj.getApp());
        alumno.setApm(obj.getApm());
        alumno.setEdad(obj.getEdad());
        alumno.setSexo(obj.getSexo());
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        alumno.setLogin(login);
        alumno.setFechaRegistro(new Date());
        alumnoDAO.insert(alumno);
    }

    @Override
    public void delete(AlumnoBean obj) {
        Alumno alumno = new Alumno();
        alumno.setMatricula(obj.getMatricula());
        alumno.setNombre(obj.getNombre());
        alumno.setApp(obj.getApp());
        alumno.setApm(obj.getApm());
        alumno.setEdad(obj.getEdad());
        alumno.setSexo(obj.getSexo());
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        alumno.setFechaRegistro(obj.getFechaRegistro());
        alumno.setLogin(login);
        alumnoDAO.delete(alumno);
    }

    @Override
    public void update(AlumnoBean obj) {
        Alumno alumno = new Alumno();
        alumno.setMatricula(obj.getMatricula());
        alumno.setNombre(obj.getNombre());
        alumno.setApp(obj.getApp());
        alumno.setApm(obj.getApm());
        alumno.setEdad(obj.getEdad());
        alumno.setSexo(obj.getSexo());
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        alumno.setLogin(login);
        alumno.setFechaRegistro(obj.getFechaRegistro());
        alumnoDAO.update(alumno);
    }

    @Override
    public List<AlumnoBean> getAll() {
        List<AlumnoBean> lista = new ArrayList();
        for(Alumno obj: alumnoDAO.getAll()) {
            AlumnoBean bean = new AlumnoBean();
            bean.setMatricula(obj.getMatricula());
            bean.setNombre(obj.getNombre());
            bean.setApp(obj.getApp());
            bean.setApm(obj.getApm());
            bean.setSexo(obj.getSexo());
            bean.setEdad(obj.getEdad());
            bean.setUsuario(obj.getLogin().getUsuario());
            bean.setFechaRegistro(obj.getFechaRegistro());
            lista.add(bean);
        }
        return lista;
    }

    /**
     * @return the alumnoDAO
     */
    public AlumnoDao getAlumnoDAO() {
        return alumnoDAO;
    }

    /**
     * @param alumnoDAO the alumnoDAO to set
     */
    public void setAlumnoDAO(AlumnoDao alumnoDAO) {
        this.alumnoDAO = alumnoDAO;
    }

    @Override
    public List<AlumnoBean> getAllByFechas(AlumnoBean alumno) {
        List<AlumnoBean> lista = new ArrayList();
        for(Alumno obj: alumnoDAO.getAllByFechas(alumno)) {
            AlumnoBean bean = new AlumnoBean();
            bean.setMatricula(obj.getMatricula());
            bean.setNombre(obj.getNombre());
            bean.setApp(obj.getApp());
            bean.setApm(obj.getApm());
            bean.setSexo(obj.getSexo());
            bean.setEdad(obj.getEdad());
            bean.setUsuario(obj.getLogin().getUsuario());
            bean.setFechaRegistro(obj.getFechaRegistro());
            lista.add(bean);
        }
        return lista;
    }
    
    @Override
    public List<AlumnoBean> getAllByCriterio(AlumnoBean alumno) {
        List<AlumnoBean> lista = new ArrayList();
        for(Alumno obj: alumnoDAO.buscarByCriterio(alumno)) {
            AlumnoBean bean = new AlumnoBean();
            bean.setMatricula(obj.getMatricula());
            bean.setNombre(obj.getNombre());
            bean.setApp(obj.getApp());
            bean.setApm(obj.getApm());
            bean.setSexo(obj.getSexo());
            bean.setEdad(obj.getEdad());
            bean.setUsuario(obj.getLogin().getUsuario());
            bean.setFechaRegistro(obj.getFechaRegistro());
            lista.add(bean);
        }
        return lista;
    }
}
