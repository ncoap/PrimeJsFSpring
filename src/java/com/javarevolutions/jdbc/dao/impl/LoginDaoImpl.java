package com.javarevolutions.jdbc.dao.impl;

import com.javarevolutions.jdbc.dao.LoginDao;
import com.javarevolutions.jhs.model.Login;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {
    
    @Override
    public Login validaLogin(Login obj) {
        List<Login> list = getHibernateTemplate().find("from Login where usuario = ? and password = ?", 
            obj.getUsuario(), obj.getPassword());
        if(list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
