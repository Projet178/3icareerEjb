package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpCv;

import java.util.Date;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cv generated by hbm2java
 */
@Stateless
@Remote(ImpCv.class)
@Entity
@Table(name = "cv", schema = "public")
public class Cv implements java.io.Serializable, ImpCv {

	private int idcv;
	private Etudiant etudiant;
	private String nomcv;
	private Date datedernieremodification;
	private String fichierpdf;

	public Cv() {
	}

	public Cv(int idcv, Etudiant etudiant, String nomcv, String fichierpdf) {
		this.idcv = idcv;
		this.etudiant = etudiant;
		this.nomcv = nomcv;
		this.fichierpdf = fichierpdf;
	}

	public Cv(int idcv, Etudiant etudiant, String nomcv, Date datedernieremodification, String fichierpdf) {
		this.idcv = idcv;
		this.etudiant = etudiant;
		this.nomcv = nomcv;
		this.datedernieremodification = datedernieremodification;
		this.fichierpdf = fichierpdf;
	}

	@Id

	@Column(name = "idcv", unique = true, nullable = false)
	public int getIdcv() {
		return this.idcv;
	}

	public void setIdcv(int idcv) {
		this.idcv = idcv;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idutilisateur", nullable = false)
	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	@Column(name = "nomcv", nullable = false)
	public String getNomcv() {
		return this.nomcv;
	}

	public void setNomcv(String nomcv) {
		this.nomcv = nomcv;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datedernieremodification", length = 13)
	public Date getDatedernieremodification() {
		return this.datedernieremodification;
	}

	public void setDatedernieremodification(Date datedernieremodification) {
		this.datedernieremodification = datedernieremodification;
	}

	@Column(name = "fichierpdf", nullable = false)
	public String getFichierpdf() {
		return this.fichierpdf;
	}

	public void setFichierpdf(String fichierpdf) {
		this.fichierpdf = fichierpdf;
	}

}
