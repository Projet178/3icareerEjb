package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpEntrepriseDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Entreprise.
 * @see beans.Entreprise
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpEntrepriseDao.class)
public class EntrepriseDao implements ImpEntrepriseDao {

	/**
	 * 
	 */
	public EntrepriseDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final Log log = LogFactory.getLog(EntrepriseDao.class);

	private Session session;
	

	public EntrepriseDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterEntreprise(Entreprise transientInstance) {
		log.debug("persisting Entreprise instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerEntreprise(Entreprise persistentInstance) {
		log.debug("removing Entreprise instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Entreprise modifierEntreprise(Entreprise detachedInstance) {
		log.debug("merging Entreprise instance");
		try {
			Entreprise result = (Entreprise) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Entreprise retrouverEntreprise(String id) {
		log.debug("getting Entreprise instance with id: " + id);
		try {
			Entreprise instance = (Entreprise) session.load(Entreprise.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
