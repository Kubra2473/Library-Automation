import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mergeCons.egitim.util.EntityUtil;

public class DemoBean {
	private Demo demo=new Demo();
	private String adAra;
	private String sifreAra;
 private String gec;
private Demo user;
   public DemoBean(){
	   liste.add(new SelectItem("Ankara"));
	   liste.add(new SelectItem("Adana"));
	   liste.add(new SelectItem("Konya"));
	   liste.add(new SelectItem("Istanbul"));
	   liste.add(new SelectItem("Denizli"));
	   
   }
   
   private List<SelectItem> liste=new ArrayList<SelectItem>();
   private List<SelectItem>  ilceListesi=new ArrayList<SelectItem>();
   
   public void ilceDegistir(ValueChangeEvent event) {
	   ilceListesi.clear();
	   String secilen=(String) event.getNewValue();
	   if(secilen.equalsIgnoreCase("Ankara")) {
		   ilceListesi.add(new SelectItem("Mamak"));
		   ilceListesi.add(new SelectItem("Polatli"));
		   ilceListesi.add(new SelectItem("Ayas"));
	   }
	   else if(secilen.equalsIgnoreCase("Adana")) {
		   ilceListesi.add(new SelectItem("Ceyhan"));
		   ilceListesi.add(new SelectItem("Karatas"));
		   ilceListesi.add(new SelectItem("Kozan"));
	   }
	   else if(secilen.equalsIgnoreCase("Konya")) {
		   ilceListesi.add(new SelectItem("Aksehir"));
		   ilceListesi.add(new SelectItem("Ahirli"));
		   ilceListesi.add(new SelectItem("Beysehir"));
	   }
	   else if(secilen.equalsIgnoreCase("Istanbul")) {
		   ilceListesi.add(new SelectItem("Kartal"));
		   ilceListesi.add(new SelectItem("Bagcilar"));
		   ilceListesi.add(new SelectItem("Cekmekoy"));
	   }
	   else if(secilen.equalsIgnoreCase("Denizli")) {
		   ilceListesi.add(new SelectItem("Babadag"));
		   ilceListesi.add(new SelectItem("Bozkurt"));
		   ilceListesi.add(new SelectItem("Cal"));
	   }
   }


	public void kaydet() {
		EntityManager en=EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(demo.getAdres());
		en.persist(demo);
		en.getTransaction().commit();
		demo=new Demo();
	}
	public void  sil() {
		EntityManager en=EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(demo.getAdres());
		en.remove(demo);
		en.getTransaction().commit();
		demo=new Demo();
	}
	public void duzenle() {
		EntityManager en=EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(demo.getAdres());
		en.merge(demo);
		en.getTransaction().commit();
		demo=new Demo();
	}
	
	public List<Demo> getKayitListesi(){
		EntityManager en=EntityUtil.getEntityManager();
		return en.createQuery("select m From Demo m ").getResultList();
	}
	
	public String KayitListesiAra(){
		 EntityManager em=EntityUtil.getEntityManager();
		   Query q=em.createQuery("select m from Demo m WHERE m.kullaniciAdi= :kullaniciAdi  and  m.sifre= :sifre");
		   q.setParameter("kullaniciAdi", adAra);
		   q.setParameter("sifre", getSifreAra());
		   List<Demo> listele=q.getResultList();
		   if(listele.size()!=0) {
			   user=listele.get(0);
			   if(user.getKullaniciAdi().equals(this.adAra) && user.getSifre().equals(this.getSifreAra())) 
				  {
					 gec="dogru";
				  }
				  else {
					gec="hata";
				  }
				  
			   }   
		   return gec;
		   }


	public Demo getDemo() {
		return demo;
	}

	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	public String getAdAra() {
		return adAra;
	}
	public void setAdAra(String adAra) {
		this.adAra = adAra;
	}
	
	public Demo getUser() {
		return user;
	}
	public void setUser(Demo user) {
		this.user = user;
	}
	public String getGec() {
		return gec;
	}
	public void setGec(String gec) {
		this.gec = gec;
	}
	public String getSifreAra() {
		return sifreAra;
	}
	public void setSifreAra(String sifreAra) {
		this.sifreAra = sifreAra;
	}
	public List<SelectItem> getListe() {
		return liste;
	}
	public void setListe(List<SelectItem> liste) {
		this.liste = liste;
	}


	public List<SelectItem> getIlceListesi() {
		return ilceListesi;
	}


	public void setIlceListesi(List<SelectItem> ilceListesi) {
		this.ilceListesi = ilceListesi;
	}
	
}
