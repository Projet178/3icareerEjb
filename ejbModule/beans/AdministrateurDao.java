package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpAdministrateurDao;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Administrateur.
 * @see beans.Administrateur
 * @author Hibernate Tools
 */
@Stateful
@Remote(ImpAdministrateurDao.class)
public class AdministrateurDao implements ImpAdministrateurDao {

	private static final Log log = LogFactory.getLog(AdministrateurDao.class);

	private Session session;
	
	public AdministrateurDao()  {
		
	}
	public AdministrateurDao(ManagerDao managerDao)  {
		super();
		session=managerDao.getSession();
	}

	public void ajouterAdministrateur(Administrateur transientInstance) {
		log.debug("persisting Administrateur instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerAdministrateur(Administrateur persistentInstance) {
		log.debug("removing Administrateur instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Administrateur modifierAdministrateur(Administrateur detachedInstance) {
		log.debug("merging Administrateur instance");
		try {
			Administrateur result = (Administrateur) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Administrateur retrouverAdministrateur(int id) {
		log.debug("getting Administrateur instance with id: " + id);
		try {
			Administrateur instance = (Administrateur) session.load(Administrateur.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
