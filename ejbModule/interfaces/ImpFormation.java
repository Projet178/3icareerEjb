package interfaces;

import java.util.Date;
import java.util.Set;

import beans.Suivreformation;

public interface ImpFormation {

	public int getIdformation();

	public void setIdformation(int idformation);

	public String getLibelleformation();

	public void setLibelleformation(String libelleformation);
	
	public String getEcoleformation();
	
	public void setEcoleformation(String ecoleformation);

	public Date getAnneeformation();

	public void setAnneeformation(Date anneeformation);
	
	public Set<Suivreformation> getSuivreformations();

	public void setSuivreformations(Set<Suivreformation> suivreformations);
	
}
