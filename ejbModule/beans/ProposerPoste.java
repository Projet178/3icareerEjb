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

import interfaces.ImpProposerPoste;

/**
 * ProposerPoste generated by hbm2java
 */
@Stateless
@Remote(ImpProposerPoste.class)

@Entity
@Table(name = "proposer_poste", schema = "public")
public class ProposerPoste implements java.io.Serializable, ImpProposerPoste {

	private ProposerPosteId id;
	private Offre offre;
	private Typeposte typeposte;
	private Character libelle;

	public ProposerPoste() {
	}

	public ProposerPoste(ProposerPosteId id, Offre offre, Typeposte typeposte) {
		this.id = id;
		this.offre = offre;
		this.typeposte = typeposte;
	}

	public ProposerPoste(ProposerPosteId id, Offre offre, Typeposte typeposte, Character libelle) {
		this.id = id;
		this.offre = offre;
		this.typeposte = typeposte;
		this.libelle = libelle;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idposte", column = @Column(name = "idposte", nullable = false) ),
			@AttributeOverride(name = "idoffre", column = @Column(name = "idoffre", nullable = false) ) })
	public ProposerPosteId getId() {
		return this.id;
	}

	public void setId(ProposerPosteId id) {
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
	@JoinColumn(name = "idposte", nullable = false, insertable = false, updatable = false)
	public Typeposte getTypeposte() {
		return this.typeposte;
	}

	public void setTypeposte(Typeposte typeposte) {
		this.typeposte = typeposte;
	}

	@Column(name = "libelle", length = 1)
	public Character getLibelle() {
		return this.libelle;
	}

	public void setLibelle(Character libelle) {
		this.libelle = libelle;
	}

}
