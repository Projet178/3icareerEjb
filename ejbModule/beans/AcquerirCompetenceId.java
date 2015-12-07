package beans;
// Generated 22 nov. 2015 15:00:06 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AcquerirCompetenceId generated by hbm2java
 */
@SuppressWarnings("serial")
@Embeddable
public class AcquerirCompetenceId implements java.io.Serializable {

	private int idutilisateur;
	private int idcompetence;

	public AcquerirCompetenceId() {
	}

	public AcquerirCompetenceId(int idutilisateur, int idcompetence) {
		this.idutilisateur = idutilisateur;
		this.idcompetence = idcompetence;
	}

	@Column(name = "idutilisateur", nullable = false)
	public int getIdutilisateur() {
		return this.idutilisateur;
	}

	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}

	@Column(name = "idcompetence", nullable = false)
	public int getIdcompetence() {
		return this.idcompetence;
	}

	public void setIdcompetence(int idcompetence) {
		this.idcompetence = idcompetence;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AcquerirCompetenceId))
			return false;
		AcquerirCompetenceId castOther = (AcquerirCompetenceId) other;

		return (this.getIdutilisateur() == castOther.getIdutilisateur())
				&& (this.getIdcompetence() == castOther.getIdcompetence());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdutilisateur();
		result = 37 * result + this.getIdcompetence();
		return result;
	}

}