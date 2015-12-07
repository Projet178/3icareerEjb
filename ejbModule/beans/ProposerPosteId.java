package beans;
// Generated 24 nov. 2015 11:14:29 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProposerPosteId generated by hbm2java
 */
@Embeddable
public class ProposerPosteId implements java.io.Serializable {

	private int idposte;
	private int idoffre;

	public ProposerPosteId() {
	}

	public ProposerPosteId(int idposte, int idoffre) {
		this.idposte = idposte;
		this.idoffre = idoffre;
	}

	@Column(name = "idposte", nullable = false)
	public int getIdposte() {
		return this.idposte;
	}

	public void setIdposte(int idposte) {
		this.idposte = idposte;
	}

	@Column(name = "idoffre", nullable = false)
	public int getIdoffre() {
		return this.idoffre;
	}

	public void setIdoffre(int idoffre) {
		this.idoffre = idoffre;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProposerPosteId))
			return false;
		ProposerPosteId castOther = (ProposerPosteId) other;

		return (this.getIdposte() == castOther.getIdposte()) && (this.getIdoffre() == castOther.getIdoffre());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdposte();
		result = 37 * result + this.getIdoffre();
		return result;
	}

}
