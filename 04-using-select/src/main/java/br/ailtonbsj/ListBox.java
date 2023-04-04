package br.ailtonbsj;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ListBox {
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
