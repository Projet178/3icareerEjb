package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpProposerPosteDao;

/**
 * Home object for domain model class ProposerPoste.
 * @see beans.ProposerPoste
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpProposerPosteDao.class)
public class ProposerPosteDao implements ImpProposerPosteDao {

	private static final Log log = LogFactory.getLog(ProposerPosteDao.class);

	private Session session;
	
	public ProposerPosteDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}
    
	/**
	 * 
	 */
	public ProposerPosteDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ajouterProposerPoste(ProposerPoste transientInstance) {
		log.debug("persisting ProposerPoste instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerProposerPoste(ProposerPoste persistentInstance) {
		log.debug("removing ProposerPoste instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProposerPoste modifierProposerPoste(ProposerPoste detachedInstance) {
		log.debug("merging ProposerPoste instance");
		try {
			ProposerPoste result = (ProposerPoste) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProposerPoste retrouverProposerPoste(ProposerPosteId id) {
		log.debug("getting ProposerPoste instance with id: " + id);
		try {
			ProposerPoste instance = (ProposerPoste) session.load(ProposerPoste.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
