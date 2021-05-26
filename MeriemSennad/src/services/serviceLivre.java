package services;

import java.sql.SQLException;

import dao.daoLivre;
import models.Livre;

public class serviceLivre {
	  
	public static boolean AjouterLiv(Livre L) throws ClassNotFoundException, SQLException {
		boolean exist = daoLivre.LivreExiste(L.getRef());
		if(exist) {
			return false;
		}else {
			int res = daoLivre.AjouterLivre(L);
			return res == 1;
		}
	}
}
