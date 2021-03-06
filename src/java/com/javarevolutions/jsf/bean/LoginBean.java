package com.javarevolutions.jsf.bean;

import com.javarevolutions.jhs.services.LoginService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public class LoginBean implements Serializable{
    private String mensaje;
    private Boolean status;
    private String user;
    private String password;
    private String nombre;
    private Integer edad;
    private String url;
    private List<LoginBean> listaUsuarios;
    private LoginService loginBO;
    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getUrl() {
        return url;
    }
    
    /**
     * @return the listaUsuarios
     */
    public List<LoginBean> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(List<LoginBean> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public String validarLogin() {
        System.out.println("User : "+getUser());
        System.out.println("Password : "+getPassword());
        getLoginBO().validaLogin(this);
        System.out.println(this.getMensaje());
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        if(this.getStatus()) {
            Map<String, Object> sessionMap = externalContext.getSessionMap();
            setListaUsuarios(new ArrayList<LoginBean>());
            sessionMap.put("listaUsuarios", getListaUsuarios());
            sessionMap.put("usuarioLogeado", this);
            System.out.println("HOLAOGLA");
            System.out.println(getUrl());
            return getUrl()+".faces";
        } else {
            ((HttpServletRequest)externalContext.getRequest()).setAttribute("errorAccesos", getMensaje());
            return "login";
        }
    }

    /**
     * @return the loginBO
     */
    public LoginService getLoginBO() {
        return loginBO;
    }

    /**
     * @param loginBO the loginBO to set
     */
    public void setLoginBO(LoginService loginBO) {
        this.loginBO = loginBO;
    }
}
