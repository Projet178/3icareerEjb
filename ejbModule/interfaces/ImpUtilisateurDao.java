package interfaces;

import beans.Utilisateur;

public interface ImpUtilisateurDao {

	public boolean verifierCompte(String email, String mdp);
		

	public Utilisateur retrouverUtilisateur(int idutilisateur);
	public void insererUtilisateur(Utilisateur utilisateur);
	public void supprimerUtilisateur(int idutilisateur);
	public void modifierUtilisateur(Utilisateur utilisateur);
		
//		public Utilisateur loadUtilisateur(String login){
//			
//		}
			


}
