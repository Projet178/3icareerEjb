package interfaces;

import beans.Evenement;

public interface ImpEvenementDao {
	
	public void ajouterEvenement(Evenement transientInstance);

	public void supprimerEvenement(Evenement persistentInstance);

	public Evenement modifierEvenement(Evenement detachedInstance) ;

	public Evenement retrouverEvenement(int id);
}
