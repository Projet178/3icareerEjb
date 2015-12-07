package interfaces;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import beans.Detenirposte;
import beans.ProposerPoste;

public interface ImpTypeposte {

	
	public int getIdposte();

	public void setIdposte(int idposte);

	public String getLibelleposte();

	public void setLibelleposte(String libelleposte);

	public Set<Detenirposte> getDetenirpostes();

	public void setDetenirpostes(Set<Detenirposte> detenirpostes);

	public Set<ProposerPoste> getProposerPostes();

	public void setProposerPostes(Set<ProposerPoste> proposerPostes);

	
	
}
