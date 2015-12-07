package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpOccuperMetier;
import interfaces.ImpOccuperMetierDao;

/**
 * Home object for domain model class OccuperMetier.
 * @see beans.OccuperMetier
 * @author Hibernate Tools
 */


@Stateless
@Remote(ImpOccuperMetier.class)

public class OccuperMetierDao implements ImpOccuperMetierDao{

	private static final Log log = LogFactory.getLog(OccuperMetierDao.class);

	private Session session;
	
	public OccuperMetierDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}
	
	/**
	 * 
	 */
	public OccuperMetierDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ajouterOccuperMetier(OccuperMetier transientInstance) {
		log.debug("persisting OccuperMetier instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerOccuperMetier(OccuperMetier persistentInstance) {
		log.debug("removing OccuperMetier instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OccuperMetier modifierOccuperMetier(OccuperMetier detachedInstance) {
		log.debug("merging OccuperMetier instance");
		try {
			OccuperMetier result = (OccuperMetier) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OccuperMetier retrouverOccuperMetier(OccuperMetierId id) {
		log.debug("getting OccuperMetier instance with id: " + id);
		try {
			OccuperMetier instance = (OccuperMetier) session.load(OccuperMetier.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
