import javax.annotation.PostConstruct;

import org.primefaces.model.chart.PieChartModel;

public class Grafik {
	private PieChartModel pieModel;  
	@PostConstruct  
	public void init() {  
	createPieModels();  
	}  
	public PieChartModel getPieModel() {  
	return pieModel;  
	}  
	private void createPieModels() {  
	createPieModel();  
	}  
	private void createPieModel() {  
	pieModel = new PieChartModel();  
	pieModel.set("Roman", 200);  
	pieModel.set("Bilim Kurgu", 50);  
	pieModel.set("Korku",20);  
	pieModel.set("Egitim",100); 
	pieModel.setTitle("Kategori");  
	pieModel.setLegendPosition("c");  
	}

}
