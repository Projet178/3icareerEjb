package interfaces;

import java.util.Date;
import java.util.Set;

import beans.ParticiperEvenement;

public interface ImpEvenement {

	public int getIdevenement();

	public void setIdevenement(int idevenement);

	public String getEtatevenement();

	public void setEtatevenement(String etatevenement);

	public String getLibelleevenement();

	public void setLibelleevenement(String libelleevenement);

	public Date getDatedebutevenement();

	public void setDatedebutevenement(Date datedebutevenement);

	public Set<ParticiperEvenement> getParticiperEvenements();

	public void setParticiperEvenements(Set<ParticiperEvenement> participerEvenements);

	
}
