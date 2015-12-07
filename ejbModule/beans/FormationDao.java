package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpFormationDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Formation.
 * @see beans.Formation
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpFormationDao.class)
public class FormationDao implements ImpFormationDao{

	private static final Log log = LogFactory.getLog(FormationDao.class);

	private Session session;
	
	
	/**
	 * 
	 */
	public FormationDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormationDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterFormation(Formation transientInstance) {
		log.debug("persisting Formation instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerFormation(Formation persistentInstance) {
		log.debug("removing Formation instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Formation modifierFormation(Formation detachedInstance) {
		log.debug("merging Formation instance");
		try {
			Formation result = (Formation) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Formation retrouverFormation(int id) {
		log.debug("getting Formation instance with id: " + id);
		try {
			Formation instance = (Formation) session.load(Formation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
