package interfaces;

import java.util.Date;
import java.util.Set;

import beans.Domaine;
import beans.ExigerCompetence;
import beans.PostulerOffre;
import beans.ProposerPoste;
import beans.Recruteur;
import beans.Ville;

public interface ImpOffre {

	public int getIdoffre();

	public void setIdoffre(int idoffre);

	public Domaine getDomaine();

	public void setDomaine(Domaine domaine);

	public Recruteur getRecruteur();

	public void setRecruteur(Recruteur recruteur);

	public Ville getVille();

	public void setVille(Ville ville);

	public String getEtatoffre();

	public void setEtatoffre(String etatoffre);

	public Date getDatepublicationoffre();
	
	public void setDatepublicationoffre(Date datepublicationoffre);

	public String getIntituleoffre();
	
	public void setIntituleoffre(String intituleoffre);

	public Integer getReferenceoffre();

	public void setReferenceoffre(Integer referenceoffre);

	public String getDescriptifoffre();

	public void setDescriptifoffre(String descriptifoffre);

	public Date getDebutmission();

	public void setDebutmission(Date debutmission);

	public Date getDureemission();

	public void setDureemission(Date dureemission);

	public String getMobiliteoffre();

	public void setMobiliteoffre(String mobiliteoffre);

	public String getProfilrecherche();

	public void setProfilrecherche(String profilrecherche);

	public String getNiveauetudeoffre();

	public void setNiveauetudeoffre(String niveauetudeoffre);
	
	public String getServiceentreprise();
	
	public void setServiceentreprise(String serviceentreprise);

	public String getEmailcontactrecrutement();

	public void setEmailcontactrecrutement(String emailcontactrecrutement);
	
	public Set<ExigerCompetence> getExigerCompetences();

	public void setExigerCompetences(Set<ExigerCompetence> exigerCompetences);
	
	public Set<ProposerPoste> getProposerPostes();
	
	public void setProposerPostes(Set<ProposerPoste> proposerPostes);

	public Set<PostulerOffre> getPostulerOffres();
	
	public void setPostulerOffres(Set<PostulerOffre> postulerOffres);

	
}
