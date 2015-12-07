
package interfaces;


import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import beans.Cv;
import beans.Detenirposte;
import beans.Experience;
import beans.Suivreformation;
import beans.Utilisateur;


public interface ImpEtudiant {

	public int getIdutilisateur();

	public void setIdutilisateur(int idutilisateur);

	public Utilisateur getUtilisateur();

	public void setUtilisateur(Utilisateur utilisateur);

	public String getIne();

	public void setIne(String ine);

	public Date getDatenaissance();

	public void setDatenaissance(Date datenaissance);

	public int getNumeroetudiant();
	
	public void setNumeroetudiant(int numeroetudiant);

	public String getMobiliteetudiant();

	public void setMobiliteetudiant(String mobiliteetudiant);

	public Date getDisponibiliteetudiant();

	public void setDisponibiliteetudiant(Date disponibiliteetudiant);

	public String getNombremaxcv();

	public void setNombremaxcv(String nombremaxcv);

	public String getNombremaxmetier();

	public void setNombremaxmetier(String nombremaxmetier);

	public String getNombremaxcompetence();

	public void setNombremaxcompetence(String nombremaxcompetence);

	public String getPhoto();

	public void setPhoto(String photo);

	public String getAnneeetudeetudiant();
	
	public void setAnneeetudeetudiant(String anneeetudeetudiant);

	public Set<Experience> getExperiences();

	public void setExperiences(Set<Experience> experiences);
	
	public Set<Detenirposte> getDetenirpostes();

	public void setDetenirpostes(Set<Detenirposte> detenirpostes);

	public Set<Suivreformation> getSuivreformations();

	public void setSuivreformations(Set<Suivreformation> suivreformations);

	public Set<Cv> getCvs();

	public void setCvs(Set<Cv> cvs);
	public String motdepasse(String motdepasse,Date dateinscription) throws NoSuchAlgorithmException, UnsupportedEncodingException;


}
