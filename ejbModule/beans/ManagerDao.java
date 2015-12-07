package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class  ManagerDao {
	
private  SessionFactory sessionfactory;
private  Session session;

	private AcquerirCompetenceDao acquerirCompetenceDao;
	private AdministrateurDao administrateurDao;
	private AnneeetudeDao anneeEtudeDao;
	private CategoriecompetenceDao categorieCompetenceDao;
	private CompetenceDao competenceDao;
	private CvDao cvDao;
	private DatecontratDao dateContratDao;
	private DetenirposteDao detenirPosteDao;
	private DomaineDao domaineDao;
	private EntrepriseDao entrepriseDao;
	private EtudiantDao etudiantDao;
	private EvenementDao evenementDao; 
	private ExigerCompetenceDao exigerCompetenceDao;
	private ExperienceDao experienceDao;
	private ExpertDao expertDao;
	private FichierDao fichierDao;
	private FormationDao formationDao;
	private MetierDao metierDao;
	private OccuperMetierDao occuperMetierDao;
	private OffreDao offreDao;
	private ParticiperEvenementDao participerEvenementDao;
	private PostulerOffreDao postulerOffreDao;
	private ProposerPosteDao proposerPosteDao;
	private RecruteurDao recruteurDao;
	private RegionDao regionDao;
	private SuivreformationDao suivreformationDao;
	private TypeposteDao typeposteDao;
	private UtilisateurDao utilisateurDao;
	private VilleDao villeDao;

	
	/**
	 * 
	 */
	public ManagerDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  Session getSession(){	
		return session;
	}
	
	public  void connexionOuvrir(){
		connexionFermer();
			try{
				//sessionfactory=new Configuration().configure().buildSessionFactory();
				Configuration configuration = new Configuration().configure("META-INF/hibernate.cfg.xml");
				StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
				sessionfactory = configuration.buildSessionFactory(builder.build());
			}
			catch(Throwable ex){
				System.err.println("création du session factory échoué"+ex);
				throw new ExceptionInInitializerError(ex);
				
			}
		
		session=sessionfactory.openSession();
	}
	
	public  void connexionFermer() {
		// TODO Auto-generated method stub
		if(session!=null){
			session.close();
			session=null;
		}
		
		if(sessionfactory!=null){
			sessionfactory.close();
			sessionfactory=null;
			
		}
		
	}
	public void transactionBegin() throws Exception {
		session.getTransaction().begin();
	}
	
	public void transactionCommit() throws Exception {
		session.flush();
		session.getTransaction().commit();
	}
	
	
	public void transactionRollback() throws Exception {
		if (session.getTransaction().isActive() ) {
			session.getTransaction().rollback();
		}
	}
	
	public EtudiantDao getEtudiantDao() {
		if(etudiantDao==null){
			etudiantDao=new EtudiantDao(this);
		}
		return etudiantDao;
	}
		
		
	public DomaineDao getDomaineDao(){
		if(domaineDao==null){
			domaineDao= new DomaineDao(this);
		}
		return domaineDao;
	}

	public AcquerirCompetenceDao getAcquerirDao() {
		if(acquerirCompetenceDao==null){
			acquerirCompetenceDao= new AcquerirCompetenceDao(this);
		}
		return acquerirCompetenceDao;
	}

	public AdministrateurDao getAdministrateurDao() {
		if(administrateurDao==null){
			administrateurDao= new AdministrateurDao(this);
		}
		return administrateurDao;
	}

	public AnneeetudeDao getAnneeEtudeDao() {
		if(anneeEtudeDao==null){
			anneeEtudeDao= new AnneeetudeDao(this);
		}
		return anneeEtudeDao;
	}

	public CategoriecompetenceDao getCategorieCompetenceDao() {
		if(categorieCompetenceDao==null){
			categorieCompetenceDao = new CategoriecompetenceDao(this);
		}
		return categorieCompetenceDao;
	}

	public CompetenceDao getCompetenceDao() {
		if(competenceDao==null){
			competenceDao= new CompetenceDao(this);
		}
		return competenceDao;
	}

	public CvDao getCvDao() {
		if(cvDao==null){
			cvDao= new CvDao(this);
		}
		return cvDao;
	}

	public DatecontratDao getDateContratDao() {
		if(dateContratDao==null){
			dateContratDao= new DatecontratDao(this);
		}
		return dateContratDao;
	}

	public DetenirposteDao getDetenirPosteDao() {
		if(detenirPosteDao==null){
			detenirPosteDao= new DetenirposteDao(this);
		}
		return detenirPosteDao;
	}

	public EntrepriseDao getEntrepriseDao() {
		if(entrepriseDao==null){
			entrepriseDao= new EntrepriseDao(this);
		}
		return entrepriseDao;
	}

	public EvenementDao getEvenementDao() {
		if(evenementDao==null){
			evenementDao= new EvenementDao(this);
		}
		return evenementDao;
	}

	public ExigerCompetenceDao getExigerCompetenceDao() {
		if(exigerCompetenceDao==null){
			exigerCompetenceDao= new ExigerCompetenceDao(this);
		}
		return exigerCompetenceDao;
	}

	public ExperienceDao getExperienceDao() {
		if(experienceDao==null){
			experienceDao= new ExperienceDao(this);
		}
		return experienceDao;
	}

	public ExpertDao getExpertDao() {
		if(expertDao==null){
			expertDao= new ExpertDao(this);
		}
		return expertDao;
	}

	public FichierDao getFichierDao() {
		if(fichierDao==null){
			fichierDao = new FichierDao(this);
		}
		return fichierDao;
	}

	public FormationDao getFormationDao() {
		if(formationDao==null){
			formationDao = new FormationDao(this);
		}
		return formationDao;
	}

	public MetierDao getMetierDao() {
		if(metierDao==null){
			metierDao= new MetierDao(this);
		}
		return metierDao;
	}

	public OccuperMetierDao getOccuperMetierDao() {
		if(occuperMetierDao==null){
			occuperMetierDao= new OccuperMetierDao(this);
		}
		return occuperMetierDao;
	}

	public OffreDao getOffreDao() {
		if(offreDao==null){
			offreDao= new OffreDao(this);
		}
		return offreDao;
	}

	public ParticiperEvenementDao getParticiperEvenementDao() {
		if(participerEvenementDao==null){
			participerEvenementDao = new ParticiperEvenementDao(this);
		}
		return participerEvenementDao;
	}

	public PostulerOffreDao getPostulerOffreDao() {
		if(postulerOffreDao==null){
			postulerOffreDao= new PostulerOffreDao(this);
		}
		return postulerOffreDao;
	}

	public ProposerPosteDao getProposerPosteDao() {
		if(proposerPosteDao==null){
			proposerPosteDao= new ProposerPosteDao(this);
		}
		return proposerPosteDao;
	}

	public RecruteurDao getRecruteurDao() {
		if(recruteurDao==null){
			recruteurDao = new RecruteurDao(this);
		}
		return recruteurDao;
	}

	public RegionDao getRegionDao() {
		if(regionDao==null){
			regionDao= new RegionDao(this);
		}
		return regionDao;
	}

	public SuivreformationDao getSuivreformationDao() {
		if(suivreformationDao==null){
			suivreformationDao = new SuivreformationDao(this);
		}
		return suivreformationDao;
	}

	public TypeposteDao getTypeposteDao() {
		if(typeposteDao ==null){
			typeposteDao = new TypeposteDao(this);
		}return typeposteDao;
	}

	public UtilisateurDao getUtilisateurDao() {
		if(utilisateurDao==null){
			utilisateurDao = new UtilisateurDao(this);
		}
		return utilisateurDao;
	}

	public VilleDao getVilleDao() {
		if(villeDao ==null){
			villeDao= new VilleDao(this);
		}return villeDao;
	}
		
	

}

