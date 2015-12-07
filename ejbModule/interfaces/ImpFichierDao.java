package interfaces;

import beans.Fichier;

public interface ImpFichierDao {
	
	public void ajouterFichier(Fichier transientInstance);

	public void supprimerFichier(Fichier persistentInstance) ;

	public Fichier modiferFichier(Fichier detachedInstance);

	public Fichier retrouverFichier(String id);
}
