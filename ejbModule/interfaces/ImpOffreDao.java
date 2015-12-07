package interfaces;

import beans.Offre;

public interface ImpOffreDao {

	public void ajouterOffre(Offre transientInstance);
	
	public void supprimerOffre(Offre persistentInstance);
	
	public Offre modifierOffre(Offre detachedInstance);
	
	public Offre retrouverOffre(int id);
}
