package services;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;

import beans.ManagerDao;


public class ManagerService {
	private ManagerDao	managerDao;
	
	//Service utilisé pour la classe Etudiant, Domaine
	ServiceGestionEtudiant serviceGestionEtudiant;
	
	public ManagerService( ManagerDao managerDao ) {
		super();
		this.managerDao = managerDao;
	}
	
	public ManagerDao getManagerDao() {
		return managerDao;
	}

	public ServiceGestionEtudiant getServiceGestionEtudiant() {
		if ( serviceGestionEtudiant == null ) {
			serviceGestionEtudiant = new ServiceGestionEtudiant( this );
		}
		System.out.println("Récup Service Gestion Etudiant Ok");
		return serviceGestionEtudiant;
	}
	
	
	
}
