package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.Categorie;
import models.Livre;

public class daoCategorie {

	public static Categorie categotirParId(int id) throws ClassNotFoundException, SQLException {
		Categorie c=null;
		DBinteraction.Connect();
		ResultSet res = DBinteraction.Select("select * from categorie where id="+id);
		if(res.next()) {
			c=new Categorie(res.getInt(1), res.getString(2), res.getString(3), null);
		}
		DBinteraction.Disconnect();
		return c;
	}
	
	public static int getIdCatByName(String name) throws ClassNotFoundException, SQLException {
		int idcat=0;
		DBinteraction.Connect();
		ResultSet res = DBinteraction.Select("select id from categorie where nom='"+name+"'");
		if(res.next()) {
			idcat = res.getInt(1);
		}
		DBinteraction.Disconnect();
		return idcat;
	}
	
	public static ArrayList<Categorie> listeCategories() throws ClassNotFoundException, SQLException{
		ArrayList<Categorie> categories = new ArrayList<Categorie>();
		DBinteraction.Connect();
		ResultSet res = DBinteraction.Select("select * from categorie");
		while(res.next()) {
			Categorie c=new Categorie(res.getInt(1), res.getString(2), res.getString(3), null);
			categories.add(c);
		}
		DBinteraction.Disconnect();
		return categories;
	}
	
	
}
