package interfaces;

import beans.AcquerirCompetence;
import beans.AcquerirCompetenceId;

public interface ImpAcquerirCompetenceDao {
	public void ajouterAcquerirCompetence(AcquerirCompetence transientInstance);

	public void supprimerAcquerirCompetence(AcquerirCompetence persistentInstance);

	public AcquerirCompetence modifierAcquerirCompetence(AcquerirCompetence detachedInstance);

	public AcquerirCompetence retrouverAcquerirCompetence(AcquerirCompetenceId id);

}
