package br.ailtonbsj;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Data;

@Data
@Named
@RequestScoped
public class PoloCar {
    String description = "Description on class Polo.";
}
