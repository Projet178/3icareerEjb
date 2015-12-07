package interfaces;

import beans.Utilisateur;

public interface ImpAdministrateur {
	public int getIdutilisateur();
	public void setIdutilisateur(int idutilisateur);

	public Utilisateur getUtilisateur();

	public void setUtilisateur(Utilisateur utilisateur);

	public String getRoleoccupeadmin();

	public void setRoleoccupeadmin(String roleoccupeadmin);

}
