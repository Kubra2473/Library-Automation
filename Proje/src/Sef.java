import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

public class Sef extends Mudur{
  private String gorev;
  private String tel;

public String getGorev() {
	return gorev;
}

public void setGorev(String gorev) {
	this.gorev = gorev;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}
}
