package interfaces;

import beans.Formation;

public interface ImpFormationDao {

	public void ajouterFormation(Formation transientInstance);
	public void supprimerFormation(Formation persistentInstance);

	public Formation modifierFormation(Formation detachedInstance);
	public Formation retrouverFormation(int id);
}
