import java.util.List;

import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class DemoView {
	public void kaydet() {
		EntityManager en=EntityUtil.getEntityManager();
		en.getTransaction().begin();
		Sef sef=new Sef();
		sef.setAd("Selim");
		sef.setSoyad("Gurlu");
		sef.setGorev("Kutuphane Sefi");
		sef.setTel("2475645");
		en.persist(sef);
		
		Kutuphaneci kutuphaneci=new Kutuphaneci();
		kutuphaneci.setAd("Bahar");
		kutuphaneci.setSoyad("Yildiz");
		kutuphaneci.setBirim("Kutuphane");
		kutuphaneci.setGorev("Kitap Odunc verme");
		en.persist(kutuphaneci);
		 Teknisyen teknisyen=new Teknisyen();
		 teknisyen.setAd("Volkan");
		 teknisyen.setSoyad("Baskoylu");
		 teknisyen.setBirimi("Elektrik");
		 teknisyen.setEposta("volkan@gmail.com");
		en.persist(teknisyen);
		en.getTransaction().commit();
		
	}
	
	
	public List<Mudur> getMliste(){
		EntityManager en=EntityUtil.getEntityManager();
		return en.createQuery("From Mudur").getResultList();
	}
	public List<Sef> getSliste(){
		EntityManager en=EntityUtil.getEntityManager();
		return en.createQuery("From Sef").getResultList();
	}
	public List<Kutuphaneci> getKliste(){
		EntityManager en=EntityUtil.getEntityManager();
		return en.createQuery("From Kutuphaneci").getResultList();
	}
	public List<Teknisyen> getTliste(){
		EntityManager en=EntityUtil.getEntityManager();
		return en.createQuery("From Teknisyen").getResultList();
	}
	
	

}
