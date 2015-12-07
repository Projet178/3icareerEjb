package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpExigerCompetenceDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class ExigerCompetence.
 * @see beans.ExigerCompetence
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpExigerCompetenceDao.class)
public class ExigerCompetenceDao implements ImpExigerCompetenceDao{

	private static final Log log = LogFactory.getLog(ExigerCompetenceDao.class);

	private Session session;
	
	
	/**
	 * 
	 */
	public ExigerCompetenceDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExigerCompetenceDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterExigerCompetence(ExigerCompetence transientInstance) {
		log.debug("persisting ExigerCompetence instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerExigenceCompetence(ExigerCompetence persistentInstance) {
		log.debug("removing ExigerCompetence instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ExigerCompetence modifierExigerCompetence(ExigerCompetence detachedInstance) {
		log.debug("merging ExigerCompetence instance");
		try {
			ExigerCompetence result = (ExigerCompetence) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExigerCompetence retrouverExigenceCompetence(ExigerCompetenceId id) {
		log.debug("getting ExigerCompetence instance with id: " + id);
		try {
			ExigerCompetence instance = (ExigerCompetence) session.load(ExigerCompetence.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
