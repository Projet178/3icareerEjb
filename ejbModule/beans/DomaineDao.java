package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpDomaineDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Domaine.
 * @see beans.Domaine
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpDomaineDao.class)
public class DomaineDao implements ImpDomaineDao {

	/**
	 * 
	 */
	public DomaineDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final Log log = LogFactory.getLog(DomaineDao.class);
	private Session session;

public DomaineDao(ManagerDao managerDao) {
	super();
	session=managerDao.getSession();
}
	
	public void ajouterDomaine(Domaine domaine) {
		log.debug("persisting Domaine instance");
		try {
			session.persist(domaine);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerDomaine(Domaine domaine) {
		log.debug("removing Domaine instance");
		try {
			session.delete(domaine);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Domaine modifierDomaine(Domaine domaine) {
		log.debug("merging Domaine instance");
		try {
			Domaine result = (Domaine) session.merge(domaine);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Domaine retrouverDomaine(String id) {
		log.debug("getting Domaine instance with id: " + id);
		try {
			Domaine domaine = (Domaine)session.load(Domaine.class, id);
			log.debug("get successful");
			return domaine;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
