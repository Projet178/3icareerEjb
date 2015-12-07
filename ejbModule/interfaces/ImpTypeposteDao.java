package interfaces;

import beans.Typeposte;

public interface ImpTypeposteDao {

	public void ajouterTypeposte(Typeposte transientInstance);

	public void supprimerTypeposte(Typeposte persistentInstance);

	public Typeposte modifierTypeposte(Typeposte detachedInstance);

	public Typeposte retrouverTypeposte(int id);
	
	
}

/*
public void ajouter( transientInstance);

public void supprimer( persistentInstance);

public modifier( detachedInstance);

public retrouver(int id);
*/