package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpCompetence;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Competence generated by hbm2java
 */
@Stateless
@Remote(ImpCompetence.class)
@Entity
@Table(name = "competence", schema = "public")
public class Competence implements java.io.Serializable, ImpCompetence {

	private int idcompetence;
	private Categoriecompetence categoriecompetence;
	private String libellecompetence;
	private Set<ExigerCompetence> exigerCompetences = new HashSet<ExigerCompetence>(0);
	private Set<AcquerirCompetence> acquerirCompetences = new HashSet<AcquerirCompetence>(0);

	public Competence() {
	}

	public Competence(int idcompetence, Categoriecompetence categoriecompetence, String libellecompetence) {
		this.idcompetence = idcompetence;
		this.categoriecompetence = categoriecompetence;
		this.libellecompetence = libellecompetence;
	}

	public Competence(int idcompetence, Categoriecompetence categoriecompetence, String libellecompetence,
			Set<ExigerCompetence> exigerCompetences, Set<AcquerirCompetence> acquerirCompetences) {
		this.idcompetence = idcompetence;
		this.categoriecompetence = categoriecompetence;
		this.libellecompetence = libellecompetence;
		this.exigerCompetences = exigerCompetences;
		this.acquerirCompetences = acquerirCompetences;
	}

	@Id

	@Column(name = "idcompetence", unique = true, nullable = false)
	public int getIdcompetence() {
		return this.idcompetence;
	}

	public void setIdcompetence(int idcompetence) {
		this.idcompetence = idcompetence;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcategoriecompetence", nullable = false)
	public Categoriecompetence getCategoriecompetence() {
		return this.categoriecompetence;
	}

	public void setCategoriecompetence(Categoriecompetence categoriecompetence) {
		this.categoriecompetence = categoriecompetence;
	}

	@Column(name = "libellecompetence", nullable = false)
	public String getLibellecompetence() {
		return this.libellecompetence;
	}

	public void setLibellecompetence(String libellecompetence) {
		this.libellecompetence = libellecompetence;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competence")
	public Set<ExigerCompetence> getExigerCompetences() {
		return this.exigerCompetences;
	}

	public void setExigerCompetences(Set<ExigerCompetence> exigerCompetences) {
		this.exigerCompetences = exigerCompetences;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "competence")
	public Set<AcquerirCompetence> getAcquerirCompetences() {
		return this.acquerirCompetences;
	}

	public void setAcquerirCompetences(Set<AcquerirCompetence> acquerirCompetences) {
		this.acquerirCompetences = acquerirCompetences;
	}

}