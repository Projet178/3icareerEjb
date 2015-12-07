package interfaces;

import beans.Offre;
import beans.PostulerOffreId;
import beans.Utilisateur;

public interface ImpPostulerOffre {

	public PostulerOffreId getId();
	
	public void setId(PostulerOffreId id);
	
	public Offre getOffre();

	public void setOffre(Offre offre);

	public Utilisateur getUtilisateur();

	public void setUtilisateur(Utilisateur utilisateur);

	public Character getLibelle();

	public void setLibelle(Character libelle);

	
}
