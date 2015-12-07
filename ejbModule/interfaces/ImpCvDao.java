package interfaces;

import beans.Cv;

public interface ImpCvDao {
	
	public void ajouterCv(Cv transientInstance);
	public void supprimerCv(Cv persistentInstance);
	public Cv modifierCv(Cv detachedInstance);
	public Cv retrouverCv(int id);
}
