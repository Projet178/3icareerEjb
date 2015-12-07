package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpAnneeetudeDao;

import java.util.Date;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;

/**
 * Home object for domain model class Anneeetude.
 * @see beans.Anneeetude
 * @author Hibernate Tools
 */
@Stateless
@Remote(ImpAnneeetudeDao.class)
public class AnneeetudeDao implements ImpAnneeetudeDao {

	private static final Log log = LogFactory.getLog(AnneeetudeDao.class);

	private Session session;
	
	public AnneeetudeDao() {
		super();
	}
	public AnneeetudeDao(ManagerDao managerDao) {
		super();
		session=managerDao.getSession();
		// TODO Auto-generated constructor stub
	}

	public void ajouterAnneeEtude(Anneeetude transientInstance) {
		log.debug("persisting Anneeetude instance");
		try {
			session.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerAnneeEtude(Anneeetude persistentInstance) {
		log.debug("removing Anneeetude instance");
		try {
			session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Anneeetude modifierAnneeEtude(Anneeetude detachedInstance) {
		log.debug("merging Anneeetude instance");
		try {
			Anneeetude result = (Anneeetude) session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Anneeetude retrouverAnneeEtude(Date id) {
		log.debug("getting Anneeetude instance with id: " + id);
		try {
			Anneeetude instance = (Anneeetude) session.load(Anneeetude.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
