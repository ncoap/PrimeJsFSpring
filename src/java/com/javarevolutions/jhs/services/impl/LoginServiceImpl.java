/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jhs.services.impl;

import com.javarevolutions.jdbc.dao.impl.LoginDaoImpl;
import com.javarevolutions.jhs.model.Login;
import com.javarevolutions.jhs.services.LoginService;
import com.javarevolutions.jsf.bean.LoginBean;
/**
 *
 * @author SergioRios
 */
public class LoginServiceImpl implements LoginService {
    private LoginDaoImpl loginDAO;
    /**
     * @return the loginDAO
     */
    public LoginDaoImpl getLoginDAO() {
        return loginDAO;
    }

    /**
     * @param loginDAO the loginDAO to set
     */
    public void setLoginDAO(LoginDaoImpl loginDAO) {
        this.loginDAO = loginDAO;
    }
    
    @Override
    public void validaLogin(LoginBean obj) {
        Login login = new Login();
        login.setUsuario(obj.getUser());
        login.setPassword(obj.getPassword());
        login = getLoginDAO().validaLogin(login);
        if(login != null) {
            obj.setUrl(login.getUrl());
            obj.setStatus(true);
            obj.setMensaje("Usuario encontrado");
        } else {
            obj.setStatus(false);
            obj.setMensaje("El usuario no existe");
        }
    }
}
