package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpDetenirPosteDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Detenirposte.
 * @see beans.Detenirposte
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpDetenirPosteDao.class)
public class DetenirposteDao implements ImpDetenirPosteDao {

	private static final Log log = LogFactory.getLog(DetenirposteDao.class);

	private Session session;
	
	 
	/**
	 * 
	 */
	public DetenirposteDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetenirposteDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterDetenirPoste(Detenirposte transientInstance) {
		log.debug("persisting Detenirposte instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerDetenirPoste(Detenirposte persistentInstance) {
		log.debug("removing Detenirposte instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Detenirposte modifierDetenirPoste(Detenirposte detachedInstance) {
		log.debug("merging Detenirposte instance");
		try {
			Detenirposte result = (Detenirposte) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Detenirposte retrouverDetenirPoste(DetenirposteId id) {
		log.debug("getting Detenirposte instance with id: " + id);
		try {
			Detenirposte instance = (Detenirposte) session.load(Detenirposte.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
