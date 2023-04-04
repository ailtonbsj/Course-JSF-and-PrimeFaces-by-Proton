package br.ailtonbsj;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Menu implements Serializable {
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
