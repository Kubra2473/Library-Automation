import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Yazar implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String yazarAdi;
	private String yazarSoyadi;
	
	@OneToMany(mappedBy="yazar")
   private List<Kitap> kitaps=new ArrayList<Kitap>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYazarSoyadi() {
		return yazarSoyadi;
	}

	public void setYazarSoyadi(String yazarSoyadi) {
		this.yazarSoyadi = yazarSoyadi;
	}

	public List<Kitap> getKitaps() {
		return kitaps;
	}

	public void setKitaps(List<Kitap> kitaps) {
		this.kitaps = kitaps;
	}


}
