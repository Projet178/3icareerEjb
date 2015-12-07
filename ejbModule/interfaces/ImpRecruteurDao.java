package interfaces;

import beans.Recruteur;

public interface ImpRecruteurDao {

	public void ajouterRecruteur(Recruteur transientInstance);

	public void supprimerRecruteur(Recruteur persistentInstance);

	public Recruteur modifierRecruteur(Recruteur detachedInstance);

	public Recruteur retrouverRecruteur(int id);
	
}
