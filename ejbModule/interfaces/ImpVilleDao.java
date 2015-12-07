package interfaces;

import beans.Ville;

public interface ImpVilleDao {
	
	public void ajouterVille(Ville transientInstance);

	public void supprimerVille(Ville persistentInstance);

	public Ville modifierVille(Ville detachedInstance);

	// /!\
	//Méthode dont le type de id était String au préalable
	public Ville retrouverVille(String id);

}
