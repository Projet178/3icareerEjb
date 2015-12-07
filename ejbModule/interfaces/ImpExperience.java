package interfaces;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import beans.Etudiant;

public interface ImpExperience {
	
	public int getIdexperience();

	public void setIdexperience(int idexperience);

	public Etudiant getEtudiant();

	public void setEtudiant(Etudiant etudiant);

	public String getTypeexperience();

	public void setTypeexperience(String typeexperience);

	public String getIntitulemissionexperience();
	
	public void setIntitulemissionexperience(String intitulemissionexperience);

	public String getContenuexperience();

	public void setContenuexperience(String contenuexperience);


}
