package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpCategoriecompetence;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categoriecompetence generated by hbm2java
 */
@Stateless
@Remote(ImpCategoriecompetence.class)
@Entity
@Table(name = "categoriecompetence", schema = "public")
public class Categoriecompetence implements java.io.Serializable, ImpCategoriecompetence {

	private String idcategoriecompetence;
	private String libellecategoriecompetence;
	private Set<Competence> competences = new HashSet<Competence>(0);

	public Categoriecompetence() {
	}

	public Categoriecompetence(String idcategoriecompetence, String libellecategoriecompetence) {
		this.idcategoriecompetence = idcategoriecompetence;
		this.libellecategoriecompetence = libellecategoriecompetence;
	}

	public Categoriecompetence(String idcategoriecompetence, String libellecategoriecompetence,
			Set<Competence> competences) {
		this.idcategoriecompetence = idcategoriecompetence;
		this.libellecategoriecompetence = libellecategoriecompetence;
		this.competences = competences;
	}

	@Id

	@Column(name = "idcategoriecompetence", unique = true, nullable = false, length = 32)
	public String getIdcategoriecompetence() {
		return this.idcategoriecompetence;
	}

	public void setIdcategoriecompetence(String idcategoriecompetence) {
		this.idcategoriecompetence = idcategoriecompetence;
	}

	@Column(name = "libellecategoriecompetence", nullable = false, length = 32)
	public String getLibellecategoriecompetence() {
		return this.libellecategoriecompetence;
	}

	public void setLibellecategoriecompetence(String libellecategoriecompetence) {
		this.libellecategoriecompetence = libellecategoriecompetence;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoriecompetence")
	public Set<Competence> getCompetences() {
		return this.competences;
	}

	public void setCompetences(Set<Competence> competences) {
		this.competences = competences;
	}

}