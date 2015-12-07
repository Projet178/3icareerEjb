package interfaces;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import beans.AcquerirCompetence;
import beans.Categoriecompetence;
import beans.ExigerCompetence;

public interface ImpCompetence {
	
	public int getIdcompetence() ;

	public void setIdcompetence(int idcompetence);
	public Categoriecompetence getCategoriecompetence();

	public void setCategoriecompetence(Categoriecompetence categoriecompetence);
	public String getLibellecompetence();

	public void setLibellecompetence(String libellecompetence);
	public Set<ExigerCompetence> getExigerCompetences();

	public void setExigerCompetences(Set<ExigerCompetence> exigerCompetences) ;
	public Set<AcquerirCompetence> getAcquerirCompetences();

	public void setAcquerirCompetences(Set<AcquerirCompetence> acquerirCompetences);

}
