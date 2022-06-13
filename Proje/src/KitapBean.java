import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import com.mergeCons.egitim.util.EntityUtil;

public class KitapBean {

	private Kitap bir = new Kitap();
	private Kitap list;
  private String ad;
	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(bir.getKutuphane());
		en.persist(bir.getYazar());
		en.persist(bir.getYayinevi());
		en.persist(bir);
		en.getTransaction().commit();
		bir = new Kitap();

	}

	public void sil() {
		EntityManager en=EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(bir.getKutuphane());
		en.remove(bir.getYazar());
		en.remove(bir.getYayinevi());
		en.remove(bir);
		en.getTransaction().commit();
		bir=new Kitap();
		
	}
	

	public void duzenle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(bir.getKutuphane());
		en.merge(bir.getYazar());
		en.merge(bir.getYayinevi());
		en.merge(bir);
		en.getTransaction().commit();
		bir = new Kitap();

	}
	
	public List<Object[]> getKayitListesi() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("select m,ma from Kitap m join m.yazar ma").getResultList();
	}
	
	public List<Object[]> KayitListe() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("Select m,ma from Kitap m join m.yazar ma where kitapAdi like :kitapAdi")
				.setParameter("kitapAdi",this.ad).getResultList();
	}
	
	
	

	public Kitap getBir() {
		return bir;
	}

	public void setBir(Kitap bir) {
		this.bir = bir;
	}

	public Kitap getList() {
		return list;
	}

	public void setList(Kitap list) {
		this.list = list;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	

	

}
