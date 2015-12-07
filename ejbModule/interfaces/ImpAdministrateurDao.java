package interfaces;

import beans.Administrateur;

public interface ImpAdministrateurDao {
	public void ajouterAdministrateur(Administrateur transientInstance);

	public void supprimerAdministrateur(Administrateur persistentInstance);

	public Administrateur modifierAdministrateur(Administrateur detachedInstance);

	public Administrateur retrouverAdministrateur(int id);
}
