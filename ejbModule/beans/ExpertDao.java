package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpExpertDao;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Expert.
 * @see beans.Expert
 * @author Hibernate Tools
 */
@Stateful
@Remote(ImpExpertDao.class)
public class ExpertDao implements ImpExpertDao {

	private static final Log log = LogFactory.getLog(ExpertDao.class);

	private Session session;
	
	
	/**
	 * 
	 */
	public ExpertDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExpertDao(ManagerDao managerDao) {
		super();
		session= managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterExpert(Expert transientInstance) {
		log.debug("persisting Expert instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerExpert(Expert persistentInstance) {
		log.debug("removing Expert instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Expert modifierExpert(Expert detachedInstance) {
		log.debug("merging Expert instance");
		try {
			Expert result = (Expert) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Expert retrouverExpert(int id) {
		log.debug("getting Expert instance with id: " + id);
		try {
			Expert instance = (Expert) session.load(Expert.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
