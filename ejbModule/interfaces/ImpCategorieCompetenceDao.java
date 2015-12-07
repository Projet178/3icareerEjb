package interfaces;

import beans.Categoriecompetence;

public interface ImpCategorieCompetenceDao {
	
	public void ajouterCategorieCompetence(Categoriecompetence transientInstance);
	public void supprimerCategorieCompetence(Categoriecompetence persistentInstance);

	public Categoriecompetence modifierCategorieCompetence(Categoriecompetence detachedInstance);

	public Categoriecompetence retrouverCategorieCompetence(String id);
}
