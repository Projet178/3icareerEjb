package interfaces;

import beans.Ville;

public interface ImpVilleDao {
	
	public void ajouterVille(Ville transientInstance);

	public void supprimerVille(Ville persistentInstance);

	public Ville modifierVille(Ville detachedInstance);

	// /!\
	//M�thode dont le type de id �tait String au pr�alable
	public Ville retrouverVille(String id);

}
