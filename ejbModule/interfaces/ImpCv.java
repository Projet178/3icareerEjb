package interfaces;

import java.util.Date;

import beans.Etudiant;

public interface ImpCv {

	public int getIdcv();

	public void setIdcv(int idcv);

	public Etudiant getEtudiant();

	public void setEtudiant(Etudiant etudiant);

	public String getNomcv();

	public void setNomcv(String nomcv) ;
	public Date getDatedernieremodification();

	public void setDatedernieremodification(Date datedernieremodification);

	public String getFichierpdf();

	public void setFichierpdf(String fichierpdf);
}
