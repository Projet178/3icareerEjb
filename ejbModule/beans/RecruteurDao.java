package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpRecruteur;
import interfaces.ImpRecruteurDao;

/**
 * Home object for domain model class Recruteur.
 * @see beans.Recruteur
 * @author Hibernate Tools
 */
@Stateless
public class RecruteurDao implements ImpRecruteurDao {

	private static final Log log = LogFactory.getLog(RecruteurDao.class);

	private Session session;
	
	public RecruteurDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}

	/**
	 * 
	 */
	public RecruteurDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ajouterRecruteur(Recruteur transientInstance) {
		log.debug("persisting Recruteur instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerRecruteur(Recruteur persistentInstance) {
		log.debug("removing Recruteur instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Recruteur modifierRecruteur(Recruteur detachedInstance) {
		log.debug("merging Recruteur instance");
		try {
			Recruteur result = (Recruteur) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Recruteur retrouverRecruteur(int id) {
		log.debug("getting Recruteur instance with id: " + id);
		try {
			Recruteur instance = (Recruteur) session.load(Recruteur.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
