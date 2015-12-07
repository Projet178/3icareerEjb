package interfaces;

import beans.Domaine;

public interface ImpDomaineDao {

	public void ajouterDomaine(Domaine domaine);

	public void supprimerDomaine(Domaine domaine);

	public Domaine modifierDomaine(Domaine domaine);

	public Domaine retrouverDomaine(String id);
}
