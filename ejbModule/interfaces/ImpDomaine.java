package interfaces;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import beans.Offre;

public interface ImpDomaine {

	public String getIddomaine();

	public void setIddomaine(String iddomaine);

	public String getLibelledomaine();

	public void setLibelledomaine(String libelledomaine);

	public Set<Offre> getOffres();

	public void setOffres(Set<Offre> offres);

}
