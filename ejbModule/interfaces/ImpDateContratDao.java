package interfaces;

import java.util.Date;

import beans.Datecontrat;

public interface ImpDateContratDao {
	
	public void ajouterDateContrat(Datecontrat transientInstance);
	public void supprimerDateContrat(Datecontrat persistentInstance);

	public Datecontrat modifierDateContrat(Datecontrat detachedInstance);

	public Datecontrat retrouverDateContrat(Date id);
}
