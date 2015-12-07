package interfaces;

import java.util.ArrayList;

import beans.Etudiant;
import beans.Utilisateur;

import java.util.List;


public interface ImpEtudiantDao {


	public ArrayList<String> listerCritere();
	//public List<Offre> loadOffre();
	public double pourcentProfil();
	public void ajouterEtudiant(Etudiant transientInstance);
	public void supprimerEtudiant(Etudiant persistentInstance);
	public Etudiant modifierEtudiant(Etudiant detachedInstance);
	public Etudiant retrouverEtudiant(int id);
	
}
