package interfaces;

import java.util.Set;

import beans.Competence;

public interface ImpCategoriecompetence {
	
	public String getIdcategoriecompetence();

	public void setIdcategoriecompetence(String idcategoriecompetence);

	public String getLibellecategoriecompetence();

	public void setLibellecategoriecompetence(String libellecategoriecompetence);

	public Set getCompetences();

	public void setCompetences(Set<Competence> competences);
}
