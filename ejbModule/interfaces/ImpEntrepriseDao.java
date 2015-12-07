package interfaces;

import beans.Entreprise;

public interface ImpEntrepriseDao {
	public void ajouterEntreprise(Entreprise transientInstance);

	public void supprimerEntreprise(Entreprise persistentInstance);

	public Entreprise modifierEntreprise(Entreprise detachedInstance);

	public Entreprise retrouverEntreprise(String id);
}
