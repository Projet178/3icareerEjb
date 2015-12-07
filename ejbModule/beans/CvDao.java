package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpCvDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Cv.
 * @see beans.Cv
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpCvDao.class)
public class CvDao implements ImpCvDao {

	/**
	 * 
	 */
	public CvDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final Log log = LogFactory.getLog(CvDao.class);

	private Session session;
	

	public CvDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterCv(Cv transientInstance) {
		log.debug("persisting Cv instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerCv(Cv persistentInstance) {
		log.debug("removing Cv instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cv modifierCv(Cv detachedInstance) {
		log.debug("merging Cv instance");
		try {
			Cv result = (Cv) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cv retrouverCv(int id) {
		log.debug("getting Cv instance with id: " + id);
		try {
			Cv instance = (Cv) session.load(Cv.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
