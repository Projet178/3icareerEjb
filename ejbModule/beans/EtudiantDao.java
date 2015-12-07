package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import java.util.ArrayList;

import interfaces.ImpEtudiantDao;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Etudiant.
 * @see beans.Etudiant
 * @author Hibernate Tools
 */
@Remote(ImpEtudiantDao.class)
@Stateful
public class EtudiantDao implements ImpEtudiantDao{

	private static final Log log = LogFactory.getLog(EtudiantDao.class);

	private Session session;
	private ManagerDao managerDao;

	
	
	/**
	 * 
	 */
	public EtudiantDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EtudiantDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		this.managerDao=managerDao;
		System.out.println(session);
	}

	public void ajouterEtudiant(Etudiant transientInstance) {
		log.debug("persisting Etudiant instance");
		try {
			
			UtilisateurDao utilisateurDao = new UtilisateurDao(managerDao);
			System.out.println("ajout util debut");
			utilisateurDao.ajouterUtilisateur(transientInstance.getUtilisateur());
			System.out.println("ajout util fin");
			transientInstance.setIdutilisateur(transientInstance.getUtilisateur().getIdutilisateur()); 
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerEtudiant(Etudiant persistentInstance) {
		log.debug("removing Etudiant instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Etudiant modifierEtudiant(Etudiant detachedInstance) {
		log.debug("merging Etudiant instance");
		try {
			Etudiant result = (Etudiant) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Etudiant retrouverEtudiant(int id) {
		log.debug("getting Etudiant instance with id: " + id);
		try {
			Etudiant instance =(Etudiant) session.load(Etudiant.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public ArrayList<String> listerCritere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double pourcentProfil() {
		// TODO Auto-generated method stub
		return 0;
	}

}
