package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpTypeposteDao;

/**
 * Home object for domain model class Typeposte.
 * @see beans.Typeposte
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpTypeposteDao.class)
public class TypeposteDao implements ImpTypeposteDao {

	private static final Log log = LogFactory.getLog(TypeposteDao.class);

	private Session session;
	
	public TypeposteDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}
	

	/**
	 * 
	 */
	public TypeposteDao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void ajouterTypeposte(Typeposte transientInstance) {
		log.debug("persisting Typeposte instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerTypeposte(Typeposte persistentInstance) {
		log.debug("removing Typeposte instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Typeposte modifierTypeposte(Typeposte detachedInstance) {
		log.debug("merging Typeposte instance");
		try {
			Typeposte result = (Typeposte) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Typeposte retrouverTypeposte(int id) {
		log.debug("getting Typeposte instance with id: " + id);
		try {
			Typeposte instance = (Typeposte) session.load(Typeposte.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
