package interfaces;

import java.util.Set;

import beans.Offre;
import beans.Region;

public interface ImpVille {

		public String getIdville();

		public void setIdville(String idville);

		public Region getRegion();

		public void setRegion(Region region);

		public String getLibelleville();

		public void setLibelleville(String libelleville);

		public Set<Offre> getOffres();

		public void setOffres(Set<Offre> offres);

	}