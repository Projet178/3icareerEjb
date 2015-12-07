package beans;
// Generated 24 nov. 2015 11:14:29 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import interfaces.ImpOffre;

/**
 * Offre generated by hbm2java
 */

@Stateful
@Remote(ImpOffre.class)


@Entity
@Table(name = "offre", schema = "public")
public class Offre implements java.io.Serializable, ImpOffre {

	private int idoffre;
	private Domaine domaine;
	private Recruteur recruteur;
	private Ville ville;
	private String etatoffre;
	private Date datepublicationoffre;
	private String intituleoffre;
	private Integer referenceoffre;
	private String descriptifoffre;
	private Date debutmission;
	private Date dureemission;
	private String mobiliteoffre;
	private String profilrecherche;
	private String niveauetudeoffre;
	private String serviceentreprise;
	private String emailcontactrecrutement;
	private Set<ExigerCompetence> exigerCompetences = new HashSet<ExigerCompetence>(0);
	private Set<ProposerPoste> proposerPostes = new HashSet<ProposerPoste>(0);
	private Set<PostulerOffre> postulerOffres = new HashSet<PostulerOffre>(0);

	public Offre() {
	}

	public Offre(int idoffre, Domaine domaine, Recruteur recruteur, Ville ville, String etatoffre,
			Date datepublicationoffre, String intituleoffre, String descriptifoffre) {
		this.idoffre = idoffre;
		this.domaine = domaine;
		this.recruteur = recruteur;
		this.ville = ville;
		this.etatoffre = etatoffre;
		this.datepublicationoffre = datepublicationoffre;
		this.intituleoffre = intituleoffre;
		this.descriptifoffre = descriptifoffre;
	}

	public Offre(int idoffre, Domaine domaine, Recruteur recruteur, Ville ville, String etatoffre,
			Date datepublicationoffre, String intituleoffre, Integer referenceoffre, String descriptifoffre,
			Date debutmission, Date dureemission, String mobiliteoffre, String profilrecherche, String niveauetudeoffre,
			String serviceentreprise, String emailcontactrecrutement, Set<ExigerCompetence> exigerCompetences,
			Set<ProposerPoste> proposerPostes, Set<PostulerOffre> postulerOffres) {
		this.idoffre = idoffre;
		this.domaine = domaine;
		this.recruteur = recruteur;
		this.ville = ville;
		this.etatoffre = etatoffre;
		this.datepublicationoffre = datepublicationoffre;
		this.intituleoffre = intituleoffre;
		this.referenceoffre = referenceoffre;
		this.descriptifoffre = descriptifoffre;
		this.debutmission = debutmission;
		this.dureemission = dureemission;
		this.mobiliteoffre = mobiliteoffre;
		this.profilrecherche = profilrecherche;
		this.niveauetudeoffre = niveauetudeoffre;
		this.serviceentreprise = serviceentreprise;
		this.emailcontactrecrutement = emailcontactrecrutement;
		this.exigerCompetences = exigerCompetences;
		this.proposerPostes = proposerPostes;
		this.postulerOffres = postulerOffres;
	}

	@Id

	@Column(name = "idoffre", unique = true, nullable = false)
	public int getIdoffre() {
		return this.idoffre;
	}

	public void setIdoffre(int idoffre) {
		this.idoffre = idoffre;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iddomaine", nullable = false)
	public Domaine getDomaine() {
		return this.domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idutilisateur", nullable = false)
	public Recruteur getRecruteur() {
		return this.recruteur;
	}

	public void setRecruteur(Recruteur recruteur) {
		this.recruteur = recruteur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idville", nullable = false)
	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	@Column(name = "etatoffre", nullable = false)
	public String getEtatoffre() {
		return this.etatoffre;
	}

	public void setEtatoffre(String etatoffre) {
		this.etatoffre = etatoffre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datepublicationoffre", nullable = false, length = 13)
	public Date getDatepublicationoffre() {
		return this.datepublicationoffre;
	}

	public void setDatepublicationoffre(Date datepublicationoffre) {
		this.datepublicationoffre = datepublicationoffre;
	}

	@Column(name = "intituleoffre", nullable = false)
	public String getIntituleoffre() {
		return this.intituleoffre;
	}

	public void setIntituleoffre(String intituleoffre) {
		this.intituleoffre = intituleoffre;
	}

	@Column(name = "referenceoffre")
	public Integer getReferenceoffre() {
		return this.referenceoffre;
	}

	public void setReferenceoffre(Integer referenceoffre) {
		this.referenceoffre = referenceoffre;
	}

	@Column(name = "descriptifoffre", nullable = false)
	public String getDescriptifoffre() {
		return this.descriptifoffre;
	}

	public void setDescriptifoffre(String descriptifoffre) {
		this.descriptifoffre = descriptifoffre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "debutmission", length = 13)
	public Date getDebutmission() {
		return this.debutmission;
	}

	public void setDebutmission(Date debutmission) {
		this.debutmission = debutmission;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dureemission", length = 13)
	public Date getDureemission() {
		return this.dureemission;
	}

	public void setDureemission(Date dureemission) {
		this.dureemission = dureemission;
	}

	@Column(name = "mobiliteoffre")
	public String getMobiliteoffre() {
		return this.mobiliteoffre;
	}

	public void setMobiliteoffre(String mobiliteoffre) {
		this.mobiliteoffre = mobiliteoffre;
	}

	@Column(name = "profilrecherche")
	public String getProfilrecherche() {
		return this.profilrecherche;
	}

	public void setProfilrecherche(String profilrecherche) {
		this.profilrecherche = profilrecherche;
	}

	@Column(name = "niveauetudeoffre", length = 32)
	public String getNiveauetudeoffre() {
		return this.niveauetudeoffre;
	}

	public void setNiveauetudeoffre(String niveauetudeoffre) {
		this.niveauetudeoffre = niveauetudeoffre;
	}

	@Column(name = "serviceentreprise", length = 32)
	public String getServiceentreprise() {
		return this.serviceentreprise;
	}

	public void setServiceentreprise(String serviceentreprise) {
		this.serviceentreprise = serviceentreprise;
	}

	@Column(name = "emailcontactrecrutement", length = 128)
	public String getEmailcontactrecrutement() {
		return this.emailcontactrecrutement;
	}

	public void setEmailcontactrecrutement(String emailcontactrecrutement) {
		this.emailcontactrecrutement = emailcontactrecrutement;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "offre")
	public Set<ExigerCompetence> getExigerCompetences() {
		return this.exigerCompetences;
	}

	public void setExigerCompetences(Set<ExigerCompetence> exigerCompetences) {
		this.exigerCompetences = exigerCompetences;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "offre")
	public Set<ProposerPoste> getProposerPostes() {
		return this.proposerPostes;
	}

	public void setProposerPostes(Set<ProposerPoste> proposerPostes) {
		this.proposerPostes = proposerPostes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "offre")
	public Set<PostulerOffre> getPostulerOffres() {
		return this.postulerOffres;
	}

	public void setPostulerOffres(Set<PostulerOffre> postulerOffres) {
		this.postulerOffres = postulerOffres;
	}

}
