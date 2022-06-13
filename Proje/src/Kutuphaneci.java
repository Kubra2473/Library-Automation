import javax.persistence.Entity;

@Entity

public class Kutuphaneci extends Mudur{
   private String birim;
   private String gorev;

public String getBirim() {
	return birim;
}

public void setBirim(String birim) {
	this.birim = birim;
}

public String getGorev() {
	return gorev;
}

public void setGorev(String gorev) {
	this.gorev = gorev;
}
}
