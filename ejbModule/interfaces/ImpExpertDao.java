package interfaces;

import beans.Expert;

public interface ImpExpertDao {
	public void ajouterExpert(Expert transientInstance);

	public void supprimerExpert(Expert persistentInstance);

	public Expert modifierExpert(Expert detachedInstance);

	public Expert retrouverExpert(int id);
}
