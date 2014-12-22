/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarevolutions.jsf.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author nelson
 */
@ManagedBean(name = "seleccionBean")
@RequestScoped
public class SeleccionBean {
    
    private String pais;
    private String codPais;
    private String codCiudad;
    private List<String> listaCiudades = new ArrayList<>();

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public List<String> getListaCiudades() {
        return listaCiudades;
    }

    public void setListaCiudades(List<String> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }
    
    public void cargarCiudades(AjaxBehaviorEvent event){
        System.out.println(event.getSource());
        switch(codPais){
            case "1" :
                //PERU
                listaCiudades.add("LIMA");
                listaCiudades.add("AYACUCHO");
                listaCiudades.add("HUANUCO");
                listaCiudades.add("LA LIBERTAD");
                break;
           
            case "2" :
                //COLOMBIA
                listaCiudades.add("NUEVA DELI");
                listaCiudades.add("QUNITANILLA");
                listaCiudades.add("CALI");
                listaCiudades.add("BOGOTÁ");
                break;
                
            case "3" : 
                //ARGENTINA
                listaCiudades.add("BUENOS AIRES");
                listaCiudades.add("AVENIDA ARGENTINA");
                break;
        }
    }
    
    public void cargarCiudadesPrime(){
        switch(codPais){
            case "1" :
                //PERU
                listaCiudades.add("LIMA");
                listaCiudades.add("AYACUCHO");
                listaCiudades.add("HUANUCO");
                listaCiudades.add("LA LIBERTAD");
                break;
           
            case "2" :
                //COLOMBIA
                listaCiudades.add("NUEVA DELI");
                listaCiudades.add("QUNITANILLA");
                listaCiudades.add("CALI");
                listaCiudades.add("BOGOTÁ");
                break;
                
            case "3" : 
                //ARGENTINA
                listaCiudades.add("BUENOS AIRES");
                listaCiudades.add("AVENIDA ARGENTINA");
                break;
        }
    }
}
