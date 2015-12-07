package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpCompetenceDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Competence.
 * @see beans.Competence
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpCompetenceDao.class)
public class CompetenceDao implements ImpCompetenceDao {

	private static final Log log = LogFactory.getLog(CompetenceDao.class);

	private Session session;
	
	
	/**
	 * 
	 */
	public CompetenceDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompetenceDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterCompetence(Competence transientInstance) {
		log.debug("persisting Competence instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerCompetence(Competence persistentInstance) {
		log.debug("removing Competence instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Competence modifierCompetence(Competence detachedInstance) {
		log.debug("merging Competence instance");
		try {
			Competence result = (Competence) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Competence retrouverCompetence(int id) {
		log.debug("getting Competence instance with id: " + id);
		try {
			Competence instance = (Competence) session.load(Competence.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
