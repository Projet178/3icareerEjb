package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpEvenementDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Evenement.
 * @see beans.Evenement
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpEvenementDao.class)
public class EvenementDao implements ImpEvenementDao {

	private static final Log log = LogFactory.getLog(EvenementDao.class);

	private Session session;
	

	/**
	 * 
	 */
	public EvenementDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EvenementDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterEvenement(Evenement transientInstance) {
		log.debug("persisting Evenement instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerEvenement(Evenement persistentInstance) {
		log.debug("removing Evenement instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Evenement modifierEvenement(Evenement detachedInstance) {
		log.debug("merging Evenement instance");
		try {
			Evenement result = (Evenement) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Evenement retrouverEvenement(int id) {
		log.debug("getting Evenement instance with id: " + id);
		try {
			Evenement instance = (Evenement) session.load(Evenement.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
