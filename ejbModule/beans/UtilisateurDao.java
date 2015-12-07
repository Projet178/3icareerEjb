package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import interfaces.ImpUtilisateur;
import interfaces.ImpUtilisateurDao;

/**
 * Home object for domain model class Utilisateur.
 * @see beans.Utilisateur
 * @author Hibernate Tools
 */
@Remote(ImpUtilisateurDao.class)
@Stateless
public  class UtilisateurDao  {
	private  Session session;

	private static final Log log = LogFactory.getLog(UtilisateurDao.class);

//	@PersistenceContext
	//private EntityManager entityManager=ManagerDao.getEntityManager();
	
	public UtilisateurDao(ManagerDao managerDao){
		super();
		session=managerDao.getSession();
		System.out.println(session);
		
	}

	public UtilisateurDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  void ajouterUtilisateur(Utilisateur transientInstance) {
		log.debug("persisting Utilisateur instance");
		try {
			//entityManager.persist(transientInstance);
			session.save(transientInstance);
			log.info("persist successful");
			
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void supprimerUtilisateur(Utilisateur persistentInstance) {
		log.debug("removing Utilisateur instance");
		try {
		session.delete(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Utilisateur modifierUtilisateur(Utilisateur detachedInstance) {
		log.debug("merging Utilisateur instance");
		try {
			Utilisateur result = (Utilisateur)session.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Utilisateur retrouverUtilisateur(int id) {
		log.debug("getting Utilisateur instance with id: " + id);
		try {
		Utilisateur instance = (Utilisateur) session.load(Utilisateur.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
