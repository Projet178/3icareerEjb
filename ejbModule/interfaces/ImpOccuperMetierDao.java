package interfaces;

import beans.OccuperMetier;
import beans.OccuperMetierId;

public interface ImpOccuperMetierDao {

	public void ajouterOccuperMetier(OccuperMetier transientInstance) ;
	
	public void supprimerOccuperMetier(OccuperMetier persistentInstance);
	
	public OccuperMetier modifierOccuperMetier(OccuperMetier detachedInstance);

	public OccuperMetier retrouverOccuperMetier(OccuperMetierId id);
	
	
}
