package interfaces;


import beans.Anneeetude;
import beans.Etudiant;
import beans.Formation;
import beans.SuivreformationId;

public interface ImpSuivreformation {

	public SuivreformationId getId();

	public void setId(SuivreformationId id);

	public Anneeetude getAnneeetude();

	public void setAnneeetude(Anneeetude anneeetude);

	public Etudiant getEtudiant();

	public void setEtudiant(Etudiant etudiant);

	public Formation getFormation();
	
	public void setFormation(Formation formation);

	public String getAnneefinformationsuivie();
	
	public void setAnneefinformationsuivie(String anneefinformationsuivie);
	
}
