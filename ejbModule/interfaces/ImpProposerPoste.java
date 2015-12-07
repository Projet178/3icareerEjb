package interfaces;


import beans.Offre;
import beans.ProposerPosteId;
import beans.Typeposte;

public interface ImpProposerPoste {

	public ProposerPosteId getId();
	
	public void setId(ProposerPosteId id);

	public Offre getOffre();

	public void setOffre(Offre offre);

	public Typeposte getTypeposte();

	public void setTypeposte(Typeposte typeposte);

	public Character getLibelle();

	public void setLibelle(Character libelle);
	
}
