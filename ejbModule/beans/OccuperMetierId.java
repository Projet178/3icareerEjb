package beans;
// Generated 24 nov. 2015 11:14:29 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OccuperMetierId generated by hbm2java
 */
@Embeddable
public class OccuperMetierId implements java.io.Serializable {

	private int idutilisateur;
	private int idmetier;

	public OccuperMetierId() {
	}

	public OccuperMetierId(int idutilisateur, int idmetier) {
		this.idutilisateur = idutilisateur;
		this.idmetier = idmetier;
	}

	@Column(name = "idutilisateur", nullable = false)
	public int getIdutilisateur() {
		return this.idutilisateur;
	}

	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}

	@Column(name = "idmetier", nullable = false)
	public int getIdmetier() {
		return this.idmetier;
	}

	public void setIdmetier(int idmetier) {
		this.idmetier = idmetier;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OccuperMetierId))
			return false;
		OccuperMetierId castOther = (OccuperMetierId) other;

		return (this.getIdutilisateur() == castOther.getIdutilisateur())
				&& (this.getIdmetier() == castOther.getIdmetier());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdutilisateur();
		result = 37 * result + this.getIdmetier();
		return result;
	}

}