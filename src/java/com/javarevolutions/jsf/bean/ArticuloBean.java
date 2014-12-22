/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jsf.bean;

import com.javarevolutions.jhs.services.ArticuloService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;

/**
 *
 * @author SergioRios
 */
public class ArticuloBean {
    private Integer idArticulo;
    private String nombre;
    private String descripcion;
    private Float costo;
    private Float precio;
    private ArticuloService articuloBO;
    private List<ArticuloBean> lista;
    private Map<String, Integer> mapa;

    /**
     * @return the idArticulo
     */
    public Integer getIdArticulo() {
        return idArticulo;
    }

    /**
     * @param idArticulo the idArticulo to set
     */
    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the costo
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * @return the precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String insert() {
        articuloBO.insert(this);
        getAll();
        return "";
    }
    
    public String delete() {
        articuloBO.delete(this);
        getAll();
        return "";
    }
    
    public String update() {
        articuloBO.update(this);
        getAll();
        return "";
    }
    
    public void getAll() {
        setLista(articuloBO.getAll());
    }
    
    @PostConstruct
    public void llenaMapa() {
        getAll();
        mapa = new LinkedHashMap<>();
        for(ArticuloBean obj: getLista()) {
            mapa.put(obj.getDescripcion(), obj.getIdArticulo());
        }
    }

    /**
     * @return the lista
     */
    public List<ArticuloBean> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<ArticuloBean> lista) {
        this.lista = lista;
    }

    /**
     * @return the articuloBO
     */
    public ArticuloService getArticuloBO() {
        return articuloBO;
    }

    /**
     * @param articuloBO the articuloBO to set
     */
    public void setArticuloBO(ArticuloService articuloBO) {
        this.articuloBO = articuloBO;
    }

    /**
     * @return the mapa
     */
    public Map<String, Integer> getMapa() {
        return mapa;
    }

    /**
     * @param mapa the mapa to set
     */
    public void setMapa(Map<String, Integer> mapa) {
        this.mapa = mapa;
    }
}
