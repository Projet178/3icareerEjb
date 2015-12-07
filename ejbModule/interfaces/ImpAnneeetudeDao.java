package interfaces;

import java.util.Date;

import beans.Anneeetude;

public interface ImpAnneeetudeDao {
	public void ajouterAnneeEtude(Anneeetude transientInstance);

	public void supprimerAnneeEtude(Anneeetude persistentInstance) ;

	public Anneeetude modifierAnneeEtude(Anneeetude detachedInstance);

	public Anneeetude retrouverAnneeEtude(Date id);
}

