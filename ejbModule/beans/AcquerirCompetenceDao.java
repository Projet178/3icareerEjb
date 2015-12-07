package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final



import interfaces.ImpAcquerirCompetenceDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class AcquerirCompetence.
 * @see beans.AcquerirCompetence
 * @author Hibernate Tools
 */
@Remote(ImpAcquerirCompetenceDao.class)
@Stateless
public class AcquerirCompetenceDao implements ImpAcquerirCompetenceDao {

	private static final Log log = LogFactory.getLog(AcquerirCompetenceDao.class);
	
	private Session session;
	
	
	public AcquerirCompetenceDao() {
	
	}
	public AcquerirCompetenceDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}

	public void ajouterAcquerirCompetence(AcquerirCompetence transientInstance) {
		log.debug("persisting AcquerirCompetence instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerAcquerirCompetence(AcquerirCompetence persistentInstance) {
		log.debug("removing AcquerirCompetence instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public AcquerirCompetence modifierAcquerirCompetence(AcquerirCompetence detachedInstance) {
		log.debug("merging AcquerirCompetence instance");
		try {
			AcquerirCompetence result = (AcquerirCompetence) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public AcquerirCompetence retrouverAcquerirCompetence(AcquerirCompetenceId id) {
		log.debug("getting AcquerirCompetence instance with id: " + id);
		try {
			AcquerirCompetence instance = (AcquerirCompetence) session.load(AcquerirCompetence.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
