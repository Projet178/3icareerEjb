package interfaces;

import beans.Utilisateur;

public interface ImpExpert {

	public int getIdutilisateur();

	public void setIdutilisateur(int idutilisateur);

	public Utilisateur getUtilisateur();

	public void setUtilisateur(Utilisateur utilisateur);

	public String getRoleoccupeexpert();
	
	public void setRoleoccupeexpert(String roleoccupeexpert);


}
