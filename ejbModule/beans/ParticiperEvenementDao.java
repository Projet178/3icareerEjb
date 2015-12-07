package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpParticiperEvenementDao;

/**
 * Home object for domain model class ParticiperEvenement.
 * @see beans.ParticiperEvenement
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpParticiperEvenementDao.class)

public class ParticiperEvenementDao implements ImpParticiperEvenementDao{

	private static final Log log = LogFactory.getLog(ParticiperEvenementDao.class);

	private Session session;

	public ParticiperEvenementDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}
	
	
	/**
	 * 
	 */
	public ParticiperEvenementDao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void ajouterParticiperEvenement(ParticiperEvenement transientInstance) {
		log.debug("persisting ParticiperEvenement instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerParticiperEvenement(ParticiperEvenement persistentInstance) {
		log.debug("removing ParticiperEvenement instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ParticiperEvenement modifierParticiperEvenement(ParticiperEvenement detachedInstance) {
		log.debug("merging ParticiperEvenement instance");
		try {
			ParticiperEvenement result = (ParticiperEvenement) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ParticiperEvenement retrouverParticiperEvenement(ParticiperEvenementId id) {
		log.debug("getting ParticiperEvenement instance with id: " + id);
		try {
			ParticiperEvenement instance = (ParticiperEvenement) session.load(ParticiperEvenement.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
