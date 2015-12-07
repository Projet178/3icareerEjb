package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpDateContratDao;

import java.util.Date;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Datecontrat.
 * @see beans.Datecontrat
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpDateContratDao.class)
public class DatecontratDao implements ImpDateContratDao {

	private static final Log log = LogFactory.getLog(DatecontratDao.class);

	private Session session;
	
	

	/**
	 * 
	 */
	public DatecontratDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DatecontratDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterDateContrat(Datecontrat transientInstance) {
		log.debug("persisting Datecontrat instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerDateContrat(Datecontrat persistentInstance) {
		log.debug("removing Datecontrat instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Datecontrat modifierDateContrat(Datecontrat detachedInstance) {
		log.debug("merging Datecontrat instance");
		try {
			Datecontrat result = (Datecontrat) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Datecontrat retrouverDateContrat(Date id) {
		log.debug("getting Datecontrat instance with id: " + id);
		try {
			Datecontrat instance = (Datecontrat) session.load(Datecontrat.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
