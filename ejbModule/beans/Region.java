package beans;
// Generated 24 nov. 2015 11:14:29 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import interfaces.ImpRegion;

/**
 * Region generated by hbm2java
 */

@Stateless
@Remote(ImpRegion.class)

@Entity
@Table(name = "region", schema = "public")
public class Region implements java.io.Serializable, ImpRegion {

	private String idregion;
	private String libelleregion;
	private Set<Ville> villes = new HashSet<Ville>(0);

	public Region() {
	}

	public Region(String idregion, String libelleregion) {
		this.idregion = idregion;
		this.libelleregion = libelleregion;
	}

	public Region(String idregion, String libelleregion, Set<Ville> villes) {
		this.idregion = idregion;
		this.libelleregion = libelleregion;
		this.villes = villes;
	}

	@Id

	@Column(name = "idregion", unique = true, nullable = false, length = 32)
	public String getIdregion() {
		return this.idregion;
	}

	public void setIdregion(String idregion) {
		this.idregion = idregion;
	}

	@Column(name = "libelleregion", nullable = false, length = 32)
	public String getLibelleregion() {
		return this.libelleregion;
	}

	public void setLibelleregion(String libelleregion) {
		this.libelleregion = libelleregion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
	public Set<Ville> getVilles() {
		return this.villes;
	}

	public void setVilles(Set<Ville> villes) {
		this.villes = villes;
	}

}
