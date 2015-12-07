package interfaces;

import beans.PostulerOffre;
import beans.PostulerOffreId;

public interface ImpPostulerOffreDao {
	
	public void ajouterPostulerOffre(PostulerOffre transientInstance);
	
	public void supprimerPostulerOffre(PostulerOffre persistentInstance);

	public PostulerOffre modifierPostulerOffre(PostulerOffre detachedInstance);

	public PostulerOffre retrouverPostulerOffre(PostulerOffreId id);

}
