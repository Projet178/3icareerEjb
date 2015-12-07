package interfaces;

import beans.ProposerPoste;
import beans.ProposerPosteId;

public interface ImpProposerPosteDao {

	public void ajouterProposerPoste(ProposerPoste transientInstance);

	public void supprimerProposerPoste(ProposerPoste persistentInstance);

	public ProposerPoste modifierProposerPoste(ProposerPoste detachedInstance);

	public ProposerPoste retrouverProposerPoste(ProposerPosteId id);

	
}
