package br.ailtonbsj;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Data;

@Data
@Named
@RequestScoped
public class CarGenerator {
    @Inject
    PoloCar polo;
    
    String description = "Description on Car Generator.";
}
