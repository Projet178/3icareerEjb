package interfaces;

import java.util.Set;


import beans.Entreprise;
import beans.Offre;
import beans.Utilisateur;

public interface ImpRecruteur {

	public int getIdutilisateur();

	public void setIdutilisateur(int idutilisateur);
	
	public Entreprise getEntreprise();

	public void setEntreprise(Entreprise entreprise);

	public Utilisateur getUtilisateur();

	public void setUtilisateur(Utilisateur utilisateur);

	public Set<Offre> getOffres();

	public void setOffres(Set<Offre> offres);

	
}
