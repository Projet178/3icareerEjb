package interfaces;

import java.util.Date;
import java.util.Set;

import beans.Suivreformation;

public interface ImpAnneeetude {
	public Date getAaaa();
	public void setAaaa(Date aaaa);
	public Set getSuivreformations();
	public void setSuivreformations(Set<Suivreformation> suivreformations);
}
