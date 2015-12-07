package interfaces;

import java.util.Set;

import beans.Ville;

public interface ImpRegion {
	
	
	public String getIdregion();

	public void setIdregion(String idregion);

	public String getLibelleregion();

	public void setLibelleregion(String libelleregion);

	public Set<Ville> getVilles();

	public void setVilles(Set<Ville> villes);
	
}
