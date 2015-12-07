package interfaces;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import beans.Recruteur;

public interface ImpEntreprise {

public String getIdentreprise();

public void setIdentreprise(String identreprise);

public String getNomentreprise();

public void setNomentreprise(String nomentreprise);

public String getNumeroadresseentreprise();

public void setNumeroadresseentreprise(String numeroadresseentreprise);

public String getAdresseentreprise();

public void setAdresseentreprise(String adresseentreprise);

public String getCodepostalentreprise();

public void setCodepostalentreprise(String codepostalentreprise);

public String getVilleentreprise();

public void setVilleentreprise(String villeentreprise);

public String getPaysentreprise();

public void setPaysentreprise(String paysentreprise);

public String getLogoentreprise();

public void setLogoentreprise(String logoentreprise);

public String getDescriptionentreprise();

public void setDescriptionentreprise(String descriptionentreprise);

public Set<Recruteur> getRecruteurs();

public void setRecruteurs(Set<Recruteur> recruteurs);

}
