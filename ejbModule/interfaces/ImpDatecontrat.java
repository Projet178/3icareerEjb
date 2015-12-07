package interfaces;

import java.util.Date;
import java.util.Set;

import beans.Detenirposte;

public interface ImpDatecontrat {

	public Date getMmaa();

	public void setMmaa(Date mmaa);

	public Set getDetenirpostes();

	public void setDetenirpostes(Set<Detenirposte> detenirpostes);
}
