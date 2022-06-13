import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Yayinevi implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String yayineviAdi;
	
	@OneToMany(mappedBy="yayinevi")
	private List<Kitap> kitaps=new ArrayList<Kitap>();
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYayineviAdi() {
		return yayineviAdi;
	}

	public void setYayineviAdi(String yayineviAdi) {
		this.yayineviAdi = yayineviAdi;
	}

	

	public List<Kitap> getKitaps() {
		return kitaps;
	}

	public void setKitaps(List<Kitap> kitaps) {
		this.kitaps = kitaps;
	}


	


	
}
