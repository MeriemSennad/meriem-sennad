package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Personne;
import models.Role;

public class daoPersonne {
	
	
	public static int AjouterEtudiant(Personne p) throws ClassNotFoundException, SQLException {
		DBinteraction.Connect();
		int res = DBinteraction.Maj("INSERT INTO `personne`(`nom`, `prenom`, `email`, `mdp`, `role`) VALUES ('"+p.getNom()+"','"+p.getPrenom()+"','"+p.getEmail()+"','"+p.getMdp()+"','etudiant')");
		DBinteraction.Disconnect();
		return res;
	}
		
	public static boolean PersonneExiste(String email) throws ClassNotFoundException, SQLException {
		boolean exist = false ;
		DBinteraction.Connect();
		ResultSet res = DBinteraction.Select("select * from personne where email='"+email+"'");
		if(res.next()) {
			exist=true;
		}
		DBinteraction.Disconnect();
		return exist;
	}
	
	public static Personne authentification(String login,String password) throws SQLException, ClassNotFoundException {
		ResultSet res = null;
		Personne p=null;
		DBinteraction.Connect();
		res = DBinteraction.Select("select * from personne where email='"+login+"' and mdp='"+password+"'");
		if(res.next()) {
			p=new Personne(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), null);
			if(res.getString(6).equals("etudiant")) {
				p.setRole(Role.ETUDIANT);
			} else if(res.getString(6).equals("admin")) {
				p.setRole(Role.ADMIN);
			}else {
				p.setRole(Role.AUTEUR);
			}
		}
		DBinteraction.Disconnect();
		return p;
	}
	public static ArrayList<Personne> listeAuteurs() throws ClassNotFoundException, SQLException{
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		DBinteraction.Connect();
		ResultSet res = DBinteraction.Select("select * from personne where role='auteur'");
		while(res.next()) {
			Personne p=new Personne(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), Role.AUTEUR);
			personnes.add(p);
		}
		DBinteraction.Disconnect();
		return personnes;
	}
}