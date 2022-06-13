import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

import org.hibernate.validator.Email;
import org.hibernate.validator.Range;

import com.mergeCons.egitim.util.EntityUtil;

@Entity
@Table(name="Uye")
public class Demo implements Serializable{
	@TableGenerator(name="id_al",
			pkColumnName="Ad",
			valueColumnName="deger",
			allocationSize=10,
			pkColumnValue="Demo")
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="id_al")
	private Long id;
	
	@Column(name="Ad",insertable=true,nullable=false)
	private String ad;
	
	private String soyad;
	private String cinsiyet;
	private String yas;
	
	@Email
	private String eposta;
	
	private String tel;
	private String kullaniciAdi;
	private String sifre;
	
	
	@PostConstruct
	public void ilk() {
		System.out.println("Nesne jsf Contex'ine girdi");
	}	
		
	public void   son() {
		System.out.println("Nesne jsf Contex'inden cikti");
	}
	
	
  @Version
    private Integer a;
  
  @OneToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.ALL})
    private Adres adres=new Adres();
  
	public String getAd() {
		return ad;
	}

	
	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	


	
	

}
