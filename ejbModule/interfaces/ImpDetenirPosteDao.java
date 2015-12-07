package interfaces;

import beans.Detenirposte;
import beans.DetenirposteId;

public interface ImpDetenirPosteDao {
	public void ajouterDetenirPoste(Detenirposte transientInstance) ;

	public void supprimerDetenirPoste(Detenirposte persistentInstance);

	public Detenirposte modifierDetenirPoste(Detenirposte detachedInstance) ;

	public Detenirposte retrouverDetenirPoste(DetenirposteId id);
}
