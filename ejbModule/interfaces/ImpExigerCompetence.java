package interfaces;

import beans.Competence;

import beans.ExigerCompetenceId;
import beans.Offre;

public interface ImpExigerCompetence {

	public ExigerCompetenceId getId();

	public void setId(ExigerCompetenceId id) ;
	public Competence getCompetence() ;

	public void setCompetence(Competence competence) ;
	public Offre getOffre();

	public void setOffre(Offre offre);
	public Character getLibelle();

	public void setLibelle(Character libelle);


	
}
