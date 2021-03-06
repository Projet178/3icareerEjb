package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpDetenirposte;

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

/**
 * Detenirposte generated by hbm2java
 */
@Stateless
@Remote(ImpDetenirposte.class)
@Entity
@Table(name = "detenirposte", schema = "public")
public class Detenirposte implements java.io.Serializable, ImpDetenirposte {

	private DetenirposteId id;
	private Datecontrat datecontrat;
	private Etudiant etudiant;
	private Typeposte typeposte;

	public Detenirposte() {
	}

	public Detenirposte(DetenirposteId id, Datecontrat datecontrat, Etudiant etudiant, Typeposte typeposte) {
		this.id = id;
		this.datecontrat = datecontrat;
		this.etudiant = etudiant;
		this.typeposte = typeposte;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idutilisateur", column = @Column(name = "idutilisateur", nullable = false) ),
			@AttributeOverride(name = "idposte", column = @Column(name = "idposte", nullable = false) ),
			@AttributeOverride(name = "mmaa", column = @Column(name = "mmaa", nullable = false, length = 13) ) })
	public DetenirposteId getId() {
		return this.id;
	}

	public void setId(DetenirposteId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mmaa", nullable = false, insertable = false, updatable = false)
	public Datecontrat getDatecontrat() {
		return this.datecontrat;
	}

	public void setDatecontrat(Datecontrat datecontrat) {
		this.datecontrat = datecontrat;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idutilisateur", nullable = false, insertable = false, updatable = false)
	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idposte", nullable = false, insertable = false, updatable = false)
	public Typeposte getTypeposte() {
		return this.typeposte;
	}

	public void setTypeposte(Typeposte typeposte) {
		this.typeposte = typeposte;
	}

}
