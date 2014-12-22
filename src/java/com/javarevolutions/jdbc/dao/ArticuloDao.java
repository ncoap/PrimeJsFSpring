/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jdbc.dao;

import com.javarevolutions.jhs.model.Articulo;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface ArticuloDao {
    void insert(Articulo obj);
    void delete(Articulo obj);
    void update(Articulo obj);
    List<Articulo> getAll();
}
