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

import interfaces.ImpParticiperEvenement;

/**
 * ParticiperEvenement generated by hbm2java
 */

@Stateless
@Remote(ImpParticiperEvenement.class)

@Entity
@Table(name = "participer_evenement", schema = "public")
public class ParticiperEvenement implements java.io.Serializable, ImpParticiperEvenement {

	private ParticiperEvenementId id;
	private Evenement evenement;
	private Utilisateur utilisateur;
	private Character libelle;

	public ParticiperEvenement() {
	}

	public ParticiperEvenement(ParticiperEvenementId id, Evenement evenement, Utilisateur utilisateur) {
		this.id = id;
		this.evenement = evenement;
		this.utilisateur = utilisateur;
	}

	public ParticiperEvenement(ParticiperEvenementId id, Evenement evenement, Utilisateur utilisateur,
			Character libelle) {
		this.id = id;
		this.evenement = evenement;
		this.utilisateur = utilisateur;
		this.libelle = libelle;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idutilisateur", column = @Column(name = "idutilisateur", nullable = false) ),
			@AttributeOverride(name = "idevenement", column = @Column(name = "idevenement", nullable = false) ) })
	public ParticiperEvenementId getId() {
		return this.id;
	}

	public void setId(ParticiperEvenementId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idevenement", nullable = false, insertable = false, updatable = false)
	public Evenement getEvenement() {
		return this.evenement;
	}

	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
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