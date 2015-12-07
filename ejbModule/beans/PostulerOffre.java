package beans;
// Generated 24 nov. 2015 11:14:29 by Hibernate Tools 4.3.1.Final

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import interfaces.ImpPostulerOffre;

/**
 * PostulerOffre generated by hbm2java
 */

@Stateless 
@Remote(ImpPostulerOffre.class)

@Entity
@Table(name = "postuler_offre", schema = "public")
public class PostulerOffre implements java.io.Serializable, ImpPostulerOffre {

	private PostulerOffreId id;
	private Offre offre;
	private Utilisateur utilisateur;
	private Character libelle;

	public PostulerOffre() {
	}

	public PostulerOffre(PostulerOffreId id, Offre offre, Utilisateur utilisateur) {
		this.id = id;
		this.offre = offre;
		this.utilisateur = utilisateur;
	}

	public PostulerOffre(PostulerOffreId id, Offre offre, Utilisateur utilisateur, Character libelle) {
		this.id = id;
		this.offre = offre;
		this.utilisateur = utilisateur;
		this.libelle = libelle;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idutilisateur", column = @Column(name = "idutilisateur", nullable = false) ),
			@AttributeOverride(name = "idoffre", column = @Column(name = "idoffre", nullable = false) ) })
	public PostulerOffreId getId() {
		return this.id;
	}

	public void setId(PostulerOffreId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idoffre", nullable = false, insertable = false, updatable = false)
	public Offre getOffre() {
		return this.offre;
	}

	public void setOffre(Offre offre) {
		this.offre = offre;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idutilisateur", nullable = false, insertable = false, updatable = false)
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Column(name = "libelle", length = 1)
	public Character getLibelle() {
		return this.libelle;
	}

	public void setLibelle(Character libelle) {
		this.libelle = libelle;
	}

}