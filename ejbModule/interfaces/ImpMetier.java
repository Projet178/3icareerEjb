package interfaces;

import java.util.Set;

import beans.OccuperMetier;

public interface ImpMetier {

	public int getIdmetier();

	public void setIdmetier(int idmetier);

	public String getLibellemetier();
	
	public void setLibellemetier(String libellemetier);

	public Set<OccuperMetier> getOccuperMetiers();

	public void setOccuperMetiers(Set<OccuperMetier> occuperMetiers);
	
}
