package interfaces;

import beans.Metier;

public interface ImpMetierDao {
	
	public void ajouterMetier(Metier transientInstance);
	
	public void supprimerMetier(Metier persistentInstance);

	public Metier modifierMetier(Metier detachedInstance);

	public Metier retrouverMetier(int id);
	

}
