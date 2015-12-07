package interfaces;


import beans.AcquerirCompetenceId;
import beans.Competence;
import beans.Utilisateur;

public interface ImpAcquerirCompetence {
	public AcquerirCompetenceId getId();

	public void setId(AcquerirCompetenceId id);
	public Competence getCompetence();
	public void setCompetence(Competence competence);
	public Utilisateur getUtilisateur();
	public void setUtilisateur(Utilisateur utilisateur);
	public Character getLibelle();
	public void setLibelle(Character libelle);



}
