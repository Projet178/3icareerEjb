package interfaces;

import beans.Datecontrat;
import beans.DetenirposteId;
import beans.Etudiant;
import beans.Typeposte;

public interface ImpDetenirposte {
	public DetenirposteId getId() ;

	public void setId(DetenirposteId id);

	public Typeposte getTypeposte();

	public void setTypeposte(Typeposte typeposte);

	public Datecontrat getDatecontrat();

	public void setDatecontrat(Datecontrat datecontrat);

	public Etudiant getEtudiant();

	public void setEtudiant(Etudiant etudiant);

}
