package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpMetierDao;

/**
 * Home object for domain model class Metier.
 * @see beans.Metier
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpMetierDao.class)
public class MetierDao implements ImpMetierDao{

	private static final Log log = LogFactory.getLog(MetierDao.class);

	private Session session; 
	
	public MetierDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}
	
	/**
	 * 
	 */
	public MetierDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ajouterMetier(Metier transientInstance) {
		log.debug("persisting Metier instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerMetier(Metier persistentInstance) {
		log.debug("removing Metier instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Metier modifierMetier(Metier detachedInstance) {
		log.debug("merging Metier instance");
		try {
			Metier result = (Metier) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Metier retrouverMetier(int id) {
		log.debug("getting Metier instance with id: " + id);
		try {
			Metier instance = (Metier) session.load(Metier.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
