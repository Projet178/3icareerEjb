package util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.util.converter.DateStringConverter;
import beans.Etudiant;
import beans.EtudiantDao;
import beans.ManagerDao;
import beans.Utilisateur;
import beans.UtilisateurDao;


public class Main {

	public static void main(String[] args)   {
		ManagerDao managerDao=new ManagerDao();
		// TODO Auto-generated method stub
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		String dateToday=sdf.format(date);
		try {
			date = sdf.parse(dateToday);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Utilisateur util= new Utilisateur(1,"hachon","fabienne","fab","fab",date);
		Etudiant etudiant=null;
		managerDao.connexionOuvrir();
		try {
			managerDao.transactionBegin();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println("création etudiant debut");
			etudiant = new Etudiant("vjcv","ghcdhge","gvcd","vgghdv",date,"bkjbfe",date,23333,"fe","hvjhvcfe","hbkhvbkef","jhvjcvjd");
			System.out.println("création etudiant fin");
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println(etudiant.getUtilisateur());
		//UtilisateurDao utildao = new UtilisateurDao(managerDao);
		EtudiantDao etudiantDao = new EtudiantDao(managerDao);
		
		System.out.println("debut insertion");
		etudiantDao.ajouterEtudiant(etudiant);
		try {
			managerDao.transactionCommit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin insertion");
		
		
		
	}

}
