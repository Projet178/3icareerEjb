package interfaces;

import beans.Competence;

public interface ImpCompetenceDao {
	
	public void ajouterCompetence(Competence transientInstance);

	public void supprimerCompetence(Competence persistentInstance);

	public Competence modifierCompetence(Competence detachedInstance);

	public Competence retrouverCompetence(int id);

}
