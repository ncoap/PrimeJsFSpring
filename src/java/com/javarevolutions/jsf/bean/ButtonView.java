package com.javarevolutions.jsf.bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "buttonView")
@RequestScoped
public class ButtonView implements Serializable {

    public void buttonAction(ActionEvent actionEvent) {
        addMessage("Welcome to Primefaces!!");
    }

    public void save(ActionEvent actionEvent) {

        addMessage("Data saved");
    }

    public void update(ActionEvent actionEvent) {
        addMessage("Data updated");
    }

    public void delete(ActionEvent actionEvent) {
        addMessage("Data deleted");
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public void generateReport(final String reference) {
        try {
            //lógica de generación de informe
            addOkToCallback();
        } catch (Exception e) {
            //lógica del error
        }
    }

    private void addOkToCallback() {
        RequestContext.getCurrentInstance().addCallbackParam("ok", true);
        RequestContext.getCurrentInstance().addCallbackParam("nombre", "Nelson");
        RequestContext.getCurrentInstance().addCallbackParam("apellido", "Coqchi Apaza");
    }

}
