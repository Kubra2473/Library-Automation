
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class Teknisyen extends Mudur{
   private String birimi;
   private String eposta;

public String getBirimi() {
	return birimi;
}

public void setBirimi(String birimi) {
	this.birimi = birimi;
}

public String getEposta() {
	return eposta;
}

public void setEposta(String eposta) {
	this.eposta = eposta;
}
}
