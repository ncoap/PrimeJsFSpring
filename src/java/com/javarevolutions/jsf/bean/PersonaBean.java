package com.javarevolutions.jsf.bean;

import com.javarevolutions.jhs.model.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="personasBean")
@RequestScoped
public class PersonaBean {
    
    private List<Persona> personas = new ArrayList<Persona>();

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public void listar(){
        Persona persona = new Persona();
        persona.setCodigo(1);
        persona.setNombre("Nelson Coqchi Apaza");
        
        personas.add(persona);
    
    }

}
