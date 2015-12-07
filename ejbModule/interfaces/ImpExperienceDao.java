package interfaces;

import beans.Experience;

public interface ImpExperienceDao {

	public void ajouterExperience(Experience transientInstance);

	public void supprimerExperience(Experience persistentInstance);

	public Experience modifierExperience(Experience detachedInstance);

	public Experience retrouverExperience(int id);
}
