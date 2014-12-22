/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jhs.services.impl;

import com.javarevolutions.jdbc.dao.impl.ArticuloDaoImpl;
import com.javarevolutions.jhs.model.Articulo;
import com.javarevolutions.jhs.services.ArticuloService;
import com.javarevolutions.jsf.bean.ArticuloBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public class ArticuloServiceImpl implements ArticuloService {
    private ArticuloDaoImpl articuloDAO;
    
    @Override
    public void insert(ArticuloBean obj) {
        Articulo articulo = new Articulo();
        articulo.setIdArticulo(obj.getIdArticulo());
        articulo.setNombre(obj.getNombre());
        articulo.setDescripcion(obj.getDescripcion());
        articulo.setCosto(obj.getCosto());
        articulo.setPrecio(obj.getPrecio());
        getArticuloDAO().insert(articulo);
    }

    @Override
    public void delete(ArticuloBean obj) {
        Articulo articulo = new Articulo();
        articulo.setIdArticulo(obj.getIdArticulo());
        articulo.setNombre(obj.getNombre());
        articulo.setDescripcion(obj.getDescripcion());
        articulo.setCosto(obj.getCosto());
        articulo.setPrecio(obj.getPrecio());
        getArticuloDAO().delete(articulo);
    }

    @Override
    public void update(ArticuloBean obj) {
        Articulo articulo = new Articulo();
        articulo.setIdArticulo(obj.getIdArticulo());
        articulo.setNombre(obj.getNombre());
        articulo.setDescripcion(obj.getDescripcion());
        articulo.setCosto(obj.getCosto());
        articulo.setPrecio(obj.getPrecio());
        getArticuloDAO().update(articulo);
    }

    @Override
    public List<ArticuloBean> getAll() {
        List<ArticuloBean> lista = new ArrayList();
        for(Articulo obj: articuloDAO.getAll()) {
            ArticuloBean bean = new ArticuloBean();
            bean.setIdArticulo(obj.getIdArticulo());
            bean.setNombre(obj.getNombre());
            bean.setDescripcion(obj.getDescripcion());
            bean.setCosto(obj.getCosto());
            bean.setPrecio(obj.getPrecio());
            lista.add(bean);
        }
        return lista;
    }

    /**
     * @return the articuloDAO
     */
    public ArticuloDaoImpl getArticuloDAO() {
        return articuloDAO;
    }

    /**
     * @param articuloDAO the articuloDAO to set
     */
    public void setArticuloDAO(ArticuloDaoImpl articuloDAO) {
        this.articuloDAO = articuloDAO;
    }
}
