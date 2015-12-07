package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpCategorieCompetenceDao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Categoriecompetence.
 * @see beans.Categoriecompetence
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpCategorieCompetenceDao.class)
public class CategoriecompetenceDao implements ImpCategorieCompetenceDao {

	private static final Log log = LogFactory.getLog(CategoriecompetenceDao.class);

	private Session session;
	
	
	
	/**
	 * 
	 */
	public CategoriecompetenceDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoriecompetenceDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterCategorieCompetence(Categoriecompetence transientInstance) {
		log.debug("persisting Categoriecompetence instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerCategorieCompetence(Categoriecompetence persistentInstance) {
		log.debug("removing Categoriecompetence instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Categoriecompetence modifierCategorieCompetence(Categoriecompetence detachedInstance) {
		log.debug("merging Categoriecompetence instance");
		try {
			Categoriecompetence result = (Categoriecompetence) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Categoriecompetence retrouverCategorieCompetence(String id) {
		log.debug("getting Categoriecompetence instance with id: " + id);
		try {
			Categoriecompetence instance = (Categoriecompetence) session.load(Categoriecompetence.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
