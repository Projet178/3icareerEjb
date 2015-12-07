package interfaces;

import beans.ParticiperEvenement;
import beans.ParticiperEvenementId;

public interface ImpParticiperEvenementDao {

	public void ajouterParticiperEvenement(ParticiperEvenement transientInstance);

	public void supprimerParticiperEvenement(ParticiperEvenement persistentInstance);

	public ParticiperEvenement modifierParticiperEvenement(ParticiperEvenement detachedInstance);
	
	public ParticiperEvenement retrouverParticiperEvenement(ParticiperEvenementId id);
	
}
