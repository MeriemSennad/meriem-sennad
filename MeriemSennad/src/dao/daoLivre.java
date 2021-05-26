package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.Livre;
import models.Personne;

public class daoLivre {

	public static int AjouterLivre(Livre L) throws ClassNotFoundException, SQLException {
		DBinteraction.Connect();
		int res = DBinteraction.Maj("INSERT INTO `livre`(`ref`, `titre`, `genre`, `description`, `annee_edition`, `categorie`, `auteur`) VALUES ('"+L.getRef()+"','"+L.getTitre()+"','"+L.getGenre()+"','"+L.getAnnee_edition()+"','"+L.getCategorie()+"')");
		DBinteraction.Disconnect();
		return res;
	}
	public static boolean LivreExiste(String ref) throws ClassNotFoundException, SQLException {
		boolean exist = false ;
		DBinteraction.Connect();
		ResultSet res = DBinteraction.Select("select * from livre where ref='"+ref+"'");
		if(res.next()) {
			exist=true;
		}
		DBinteraction.Disconnect();
		return exist;
	}
}
