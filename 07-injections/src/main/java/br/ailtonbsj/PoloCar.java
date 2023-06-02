package br.ailtonbsj;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Named(value = "polo_car")
@RequestScoped
public class PoloCar {
    String description = "Description on class Polo.";
}
