
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Kutuphane implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String kutuphaneAdi="Duzce Kutuphanesi";
	private String kutuphaneAdresi="Dzce Ünv., 81620 Yörük/Düzce Merkez/Düzce";
	
	@OneToMany(mappedBy="kutuphane")
	private
	 List<Kitap> kitaps=new ArrayList<Kitap>();
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKutuphaneAdi() {
		return kutuphaneAdi;
	}

	public void setKutuphaneAdi(String kutuphaneAdi) {
		this.kutuphaneAdi = kutuphaneAdi;
	}

	public List<Kitap> getKitaps() {
		return kitaps;
	}

	public void setKitaps(List<Kitap> kitaps) {
		this.kitaps = kitaps;
	}

	public String getKutuphaneAdresi() {
		return kutuphaneAdresi;
	}

	public void setKutuphaneAdresi(String kutuphaneAdresi) {
		this.kutuphaneAdresi = kutuphaneAdresi;
	}



}