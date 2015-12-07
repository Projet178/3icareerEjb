package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import interfaces.ImpExpert;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Expert generated by hbm2java
 */
@Stateful
@Remote(ImpExpert.class)
@Entity
@Table(name = "expert", schema = "public")
public class Expert implements java.io.Serializable, ImpExpert {

	private int idutilisateur;
	private Utilisateur utilisateur;
	private String roleoccupeexpert;

	public Expert() {
	}

	public Expert(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Expert(Utilisateur utilisateur, String roleoccupeexpert) {
		this.utilisateur = utilisateur;
		this.roleoccupeexpert = roleoccupeexpert;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "utilisateur") )
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "idutilisateur", unique = true, nullable = false)
	public int getIdutilisateur() {
		return this.idutilisateur;
	}

	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Column(name = "roleoccupeexpert", length = 32)
	public String getRoleoccupeexpert() {
		return this.roleoccupeexpert;
	}

	public void setRoleoccupeexpert(String roleoccupeexpert) {
		this.roleoccupeexpert = roleoccupeexpert;
	}

}