/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jhs.services;

import com.javarevolutions.jsf.bean.ArticuloBean;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface ArticuloService {
    void insert(ArticuloBean obj);
    void delete(ArticuloBean obj);
    void update(ArticuloBean obj);
    List<ArticuloBean> getAll();
}
