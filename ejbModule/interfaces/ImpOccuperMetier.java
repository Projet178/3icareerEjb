package interfaces;

import beans.Metier;
import beans.OccuperMetierId;
import beans.Utilisateur;

public interface ImpOccuperMetier {

	public OccuperMetierId getId();
	
	public void setId(OccuperMetierId id);

	public Metier getMetier();

	public void setMetier(Metier metier);

	public Utilisateur getUtilisateur();

	public void setUtilisateur(Utilisateur utilisateur);

	public Character getLibelle();

	public void setLibelle(Character libelle);

}

	
