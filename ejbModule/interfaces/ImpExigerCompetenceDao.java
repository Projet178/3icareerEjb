package interfaces;

import beans.ExigerCompetence;
import beans.ExigerCompetenceId;

public interface ImpExigerCompetenceDao {


	public void ajouterExigerCompetence(ExigerCompetence transientInstance);

	public void supprimerExigenceCompetence(ExigerCompetence persistentInstance);

	public ExigerCompetence modifierExigerCompetence(ExigerCompetence detachedInstance);

	public ExigerCompetence retrouverExigenceCompetence(ExigerCompetenceId id);
}
