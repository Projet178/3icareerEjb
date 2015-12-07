package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpFichierDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Fichier.
 * @see beans.Fichier
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpFichierDao.class)
public class FichierDao implements ImpFichierDao {

	private static final Log log = LogFactory.getLog(FichierDao.class);

	private Session session;
	
	
	/**
	 * 
	 */
	public FichierDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FichierDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterFichier(Fichier transientInstance) {
		log.debug("persisting Fichier instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerFichier(Fichier persistentInstance) {
		log.debug("removing Fichier instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Fichier modiferFichier(Fichier detachedInstance) {
		log.debug("merging Fichier instance");
		try {
			Fichier result = (Fichier) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Fichier retrouverFichier(String id) {
		log.debug("getting Fichier instance with id: " + id);
		try {
			Fichier instance = (Fichier) session.load(Fichier.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
