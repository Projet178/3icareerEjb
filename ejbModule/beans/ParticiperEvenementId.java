package beans;
// Generated 24 nov. 2015 11:14:29 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ParticiperEvenementId generated by hbm2java
 */
@Embeddable
public class ParticiperEvenementId implements java.io.Serializable {

	private int idutilisateur;
	private int idevenement;

	public ParticiperEvenementId() {
	}

	public ParticiperEvenementId(int idutilisateur, int idevenement) {
		this.idutilisateur = idutilisateur;
		this.idevenement = idevenement;
	}

	@Column(name = "idutilisateur", nullable = false)
	public int getIdutilisateur() {
		return this.idutilisateur;
	}

	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}

	@Column(name = "idevenement", nullable = false)
	public int getIdevenement() {
		return this.idevenement;
	}

	public void setIdevenement(int idevenement) {
		this.idevenement = idevenement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ParticiperEvenementId))
			return false;
		ParticiperEvenementId castOther = (ParticiperEvenementId) other;

		return (this.getIdutilisateur() == castOther.getIdutilisateur())
				&& (this.getIdevenement() == castOther.getIdevenement());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdutilisateur();
		result = 37 * result + this.getIdevenement();
		return result;
	}

}
