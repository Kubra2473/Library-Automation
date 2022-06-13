import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Adres implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String il;
	private String ilce;
	
	@OneToOne(mappedBy="adres")
	private Demo uye;
	

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Demo getUye() {
		return uye;
	}

	public void setUye(Demo uye) {
		this.uye = uye;
	}

	
}
