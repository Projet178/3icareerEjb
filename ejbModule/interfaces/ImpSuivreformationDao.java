package interfaces;

import beans.Suivreformation;
import beans.SuivreformationId;

public interface ImpSuivreformationDao {
	
	public void ajouterSuivreformation(Suivreformation transientInstance);

	public void supprimerSuivreformation(Suivreformation persistentInstance);
	
	public Suivreformation modifierSuivreformation(Suivreformation detachedInstance);

	public Suivreformation retrouverSuivreformation(SuivreformationId id);


}
