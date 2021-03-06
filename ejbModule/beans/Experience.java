package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpExperience;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Experience generated by hbm2java
 */
@Stateless
@Remote(ImpExperience.class)
@Entity
@Table(name = "experience", schema = "public")
public class Experience implements java.io.Serializable, ImpExperience {

	private int idexperience;
	private Etudiant etudiant;
	private String typeexperience;
	private String intitulemissionexperience;
	private String contenuexperience;

	public Experience() {
	}

	public Experience(int idexperience, Etudiant etudiant, String typeexperience, String intitulemissionexperience) {
		this.idexperience = idexperience;
		this.etudiant = etudiant;
		this.typeexperience = typeexperience;
		this.intitulemissionexperience = intitulemissionexperience;
	}

	public Experience(int idexperience, Etudiant etudiant, String typeexperience, String intitulemissionexperience,
			String contenuexperience) {
		this.idexperience = idexperience;
		this.etudiant = etudiant;
		this.typeexperience = typeexperience;
		this.intitulemissionexperience = intitulemissionexperience;
		this.contenuexperience = contenuexperience;
	}

	@Id

	@Column(name = "idexperience", unique = true, nullable = false)
	public int getIdexperience() {
		return this.idexperience;
	}

	public void setIdexperience(int idexperience) {
		this.idexperience = idexperience;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idutilisateur", nullable = false)
	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	@Column(name = "typeexperience", nullable = false)
	public String getTypeexperience() {
		return this.typeexperience;
	}

	public void setTypeexperience(String typeexperience) {
		this.typeexperience = typeexperience;
	}

	@Column(name = "intitulemissionexperience", nullable = false)
	public String getIntitulemissionexperience() {
		return this.intitulemissionexperience;
	}

	public void setIntitulemissionexperience(String intitulemissionexperience) {
		this.intitulemissionexperience = intitulemissionexperience;
	}

	@Column(name = "contenuexperience")
	public String getContenuexperience() {
		return this.contenuexperience;
	}

	public void setContenuexperience(String contenuexperience) {
		this.contenuexperience = contenuexperience;
	}

}
