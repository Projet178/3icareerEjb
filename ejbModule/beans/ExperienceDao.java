package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpExperienceDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Experience.
 * @see beans.Experience
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpExperienceDao.class)
public class ExperienceDao implements ImpExperienceDao{

	private static final Log log = LogFactory.getLog(ExperienceDao.class);

	private Session session;
	
	
	/**
	 * 
	 */
	public ExperienceDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExperienceDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterExperience(Experience transientInstance) {
		log.debug("persisting Experience instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerExperience(Experience persistentInstance) {
		log.debug("removing Experience instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Experience modifierExperience(Experience detachedInstance) {
		log.debug("merging Experience instance");
		try {
			Experience result = (Experience) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Experience retrouverExperience(int id) {
		log.debug("getting Experience instance with id: " + id);
		try {
			Experience instance = (Experience) session.load(Experience.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
