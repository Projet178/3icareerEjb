package interfaces;

import beans.Region;

public interface ImpRegionDao {
	
	public void ajouterRegion(Region transientInstance);

	public void supprimerRegion(Region persistentInstance);

	public Region modifierRegion(Region detachedInstance);

	public Region retrouverRegion(String id);
}
