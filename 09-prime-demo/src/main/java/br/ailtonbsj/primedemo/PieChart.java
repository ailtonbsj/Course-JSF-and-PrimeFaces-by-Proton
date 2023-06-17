package br.ailtonbsj.primedemo;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import org.primefaces.model.chart.PieChartModel;

@Named
public class PieChart {
    private PieChartModel pieModel;

    public PieChartModel getPieModel() {
        return pieModel;
    }
    
    @PostConstruct
    public void init() {
        createPieModels();
    }

    private void createPieModels() {
        pieModel = new PieChartModel();  
        pieModel.set("Apple", 700);  
        pieModel.set("One Plus", 400);  
        pieModel.set("Samsung", 300);  
        pieModel.setTitle("Phone Brands");  
        pieModel.setLegendPosition("c");
    }
}
