import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class YoneticiGiris {
	@Id
	@GeneratedValue
	Long id;
	private String kullaniciAdi;
    private String sifre;
    
    public String giris() {
    	
		if (kullaniciAdi.equals("ruya") && sifre.equals("1234")) 
			return "gir";
		else 
                 return "yanlis";
   
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

	
}
