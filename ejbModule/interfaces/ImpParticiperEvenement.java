package interfaces;

import beans.Evenement;
import beans.ParticiperEvenementId;
import beans.Utilisateur;

public interface ImpParticiperEvenement {

	public ParticiperEvenementId getId();
	
	public void setId(ParticiperEvenementId id);

	public Evenement getEvenement();

	public void setEvenement(Evenement evenement);

	public Utilisateur getUtilisateur();

	public void setUtilisateur(Utilisateur utilisateur);

	public Character getLibelle();

	public void setLibelle(Character libelle);

	
}
