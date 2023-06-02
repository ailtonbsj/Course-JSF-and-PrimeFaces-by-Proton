package br.ailtonbsj;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Named
@RequestScoped
public class CarGenerator {
    @Inject
    @ManagedProperty(value = "#{polo_car}")
    PoloCar polo;
    
    String description = "Description on Car Generator.";
}
