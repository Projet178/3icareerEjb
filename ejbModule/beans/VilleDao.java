package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpVilleDao;

/**
 * Home object for domain model class Ville.
 * @see beans.Ville
 * @author Hibernate Tools
 */

@Stateless
@Remote(ImpVilleDao.class)

public class VilleDao implements ImpVilleDao{

	private static final Log log = LogFactory.getLog(VilleDao.class);

	private Session session;
	
	

	/**
	 * 
	 */
	public VilleDao() {
		super();
	}


	public VilleDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}
	

	public void ajouterVille(Ville transientInstance) {
		log.debug("persisting Ville instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerVille(Ville persistentInstance) {
		log.debug("removing Ville instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ville modifierVille(Ville detachedInstance) {
		log.debug("merging Ville instance");
		try {
			Ville result = (Ville) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ville retrouverVille(String id) {
		log.debug("getting Ville instance with id: " + id);
		try {
			Ville instance = (Ville) session.load(Ville.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
