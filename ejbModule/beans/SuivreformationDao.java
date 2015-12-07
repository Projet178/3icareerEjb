package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

import interfaces.ImpSuivreformation;
import interfaces.ImpSuivreformationDao;

/**
 * Home object for domain model class Suivreformation.
 * @see beans.Suivreformation
 * @author Hibernate Tools
 */
@Remote(ImpSuivreformationDao.class)
@Stateless
public class SuivreformationDao implements ImpSuivreformationDao{

	private static final Log log = LogFactory.getLog(SuivreformationDao.class);

	private Session session;
	
	public SuivreformationDao() {
		session=null;
	}
	
	
	public SuivreformationDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
	}
	
	public void ajouterSuivreformation(Suivreformation transientInstance) {
		log.debug("persisting Suivreformation instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerSuivreformation(Suivreformation persistentInstance) {
		log.debug("removing Suivreformation instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Suivreformation modifierSuivreformation(Suivreformation detachedInstance) {
		log.debug("merging Suivreformation instance");
		try {
			Suivreformation result = (Suivreformation) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Suivreformation retrouverSuivreformation(SuivreformationId id) {
		log.debug("getting Suivreformation instance with id: " + id);
		try {
			Suivreformation instance = (Suivreformation) session.load(Suivreformation.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
