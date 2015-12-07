package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpRegionDao;

/**
 * Home object for domain model class Region.
 * @see beans.Region
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpRegionDao.class)
public class RegionDao implements ImpRegionDao {

	private static final Log log = LogFactory.getLog(RegionDao.class);
	
	private Session session;
	
	public RegionDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}

	/**
	 * 
	 */
	public RegionDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ajouterRegion(Region transientInstance) {
		log.debug("persisting Region instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerRegion(Region persistentInstance) {
		log.debug("removing Region instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Region modifierRegion(Region detachedInstance) {
		log.debug("merging Region instance");
		try {
			Region result = (Region) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Region retrouverRegion(String id) {
		log.debug("getting Region instance with id: " + id);
		try {
			Region instance = (Region) session.load(Region.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

}
