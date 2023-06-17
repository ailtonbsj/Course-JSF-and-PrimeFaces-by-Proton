package br.ailtonbsj.primedemo;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class Spinner implements Serializable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
        public void addMessage() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(String.valueOf(value)));
    }
}
