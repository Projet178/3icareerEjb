package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpOffreDao;

/**
 * Home object for domain model class Offre.
 * @see beans.Offre
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpOffreDao.class)
public class OffreDao implements ImpOffreDao {

	private static final Log log = LogFactory.getLog(OffreDao.class);

	private Session session;
	
	/**
	 * 
	 */
	public OffreDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OffreDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}
	
	public void ajouterOffre(Offre transientInstance) {
		log.debug("persisting Offre instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerOffre(Offre persistentInstance) {
		log.debug("removing Offre instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Offre modifierOffre(Offre detachedInstance) {
		log.debug("merging Offre instance");
		try {
			Offre result = (Offre) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Offre retrouverOffre(int id) {
		log.debug("getting Offre instance with id: " + id);
		try {
			Offre instance = (Offre) session.load(Offre.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
