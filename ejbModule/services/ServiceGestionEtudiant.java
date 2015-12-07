package services;

import beans.Domaine;
import beans.Etudiant;
import beans.ManagerDao;

public class ServiceGestionEtudiant {
	
private ManagerDao		managerDao;

	public ServiceGestionEtudiant(ManagerService managerService) {
		super();
		managerDao = managerService.getManagerDao();
	}
	
	
	public Etudiant insertEtudiant(Etudiant etudiant) throws Exception {
		managerDao.transactionBegin();
		try {
			managerDao.getEtudiantDao().ajouterEtudiant(etudiant);
			managerDao.transactionCommit();
		} catch (Exception e) {
			managerDao.transactionRollback();;
			throw e;
		}
		return etudiant;
	}
	
	public Domaine insertDomaine(Domaine domaine) throws Exception {
		System.out.println("Classe ServiceGestionEtudiant, juste avant de faire le transactionBegin");
		managerDao.connexionOuvrir();
		managerDao.transactionBegin();
		try {
			managerDao.getDomaineDao().ajouterDomaine(domaine);
			managerDao.transactionCommit();
		} catch (Exception e) {
			managerDao.transactionRollback();
			throw e;
		}
		managerDao.connexionFermer();
		return domaine;
	}
	
	
	

}
