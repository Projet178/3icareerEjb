package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpPostulerOffre;
import interfaces.ImpPostulerOffreDao;

/**
 * Home object for domain model class PostulerOffre.
 * @see beans.PostulerOffre
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpPostulerOffreDao.class)
public class PostulerOffreDao implements ImpPostulerOffreDao {

	private static final Log log = LogFactory.getLog(PostulerOffreDao.class);

	private Session session;
	
	public PostulerOffreDao() {
		super();
		session=null;
	}
	
	public PostulerOffreDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}

	public void ajouterPostulerOffre(PostulerOffre transientInstance) {
		log.debug("persisting PostulerOffre instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerPostulerOffre(PostulerOffre persistentInstance) {
		log.debug("removing PostulerOffre instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PostulerOffre modifierPostulerOffre(PostulerOffre detachedInstance) {
		log.debug("merging PostulerOffre instance");
		try {
			PostulerOffre result = (PostulerOffre) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PostulerOffre retrouverPostulerOffre(PostulerOffreId id) {
		log.debug("getting PostulerOffre instance with id: " + id);
		try {
			PostulerOffre instance =(PostulerOffre) session.load(PostulerOffre.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
