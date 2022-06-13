import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.ViewExpiredException;
import javax.faces.model.SelectItem;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Ada_Getir",query="from Kitap where kitapAdi like :isim")
public class Kitap implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String kitapAdi;
	private String sayfaSayisi;
	private String yayinTarihi;
	private String aciklama;
	
	@ManyToOne
	private
	Kutuphane kutuphane=new Kutuphane();
	@ManyToOne
	private
   Yayinevi yayinevi=new Yayinevi();
	
	
	@ManyToOne
  private Yazar yazar=new Yazar();


	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(String sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public String getYayinTarihi() {
		return yayinTarihi;
	}

	public void setYayinTarihi(String yayinTarihi) {
		this.yayinTarihi = yayinTarihi;
	}

	public Kutuphane getKutuphane() {
		return kutuphane;
	}

	public void setKutuphane(Kutuphane kutuphane) {
		this.kutuphane = kutuphane;
	}

	public Yayinevi getYayinevi() {
		return yayinevi;
	}

	public void setYayinevi(Yayinevi yayinevi) {
		this.yayinevi = yayinevi;
	}

	public Yazar getYazar() {
		return yazar;
	}

	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	





}
