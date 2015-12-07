package interfaces;

import java.util.Date;
import java.util.Set;
import beans.Administrateur;
import beans.Etudiant;
import beans.Expert;
import beans.Recruteur;

public interface ImpUtilisateur {

	public int getIdutilisateur();

	public void setIdutilisateur(int idutilisateur);

	public String getTypeutilisateur();

	public void setTypeutilisateur(String typeutilisateur);

	public String getNomutilisateur();

	public void setNomutilisateur(String nomutilisateur);

	public String getPrenomutilisateur();
	public void setPrenomutilisateur(String prenomutilisateur) ;

	public String getMotdepasse();

	public void setMotdepasse(String motdepasse);

	public Long getNumtelephone() ;

	public void setNumtelephone(Long numtelephone);

	public String getEmail();

	public void setEmail(String email);

	public Date getDateinscription();

	public void setDateinscription(Date dateinscription);

	public Set getFichiers() ;

	public void setFichiers(Set fichiers);

	public Administrateur getAdministrateur() ;

	public void setAdministrateur(Administrateur administrateur);

	public Recruteur getRecruteur();

	public void setRecruteur(Recruteur recruteur);

	public Expert getExpert() ;
	public void setExpert(Expert expert) ;
	public Etudiant getEtudiant();

	public void setEtudiant(Etudiant etudiant); 
}