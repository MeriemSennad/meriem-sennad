package models;

public class Livre {
	private int id;
	private String ref;
	private String titre;
	private String genre;
	private String description;
	private int annee_edition;
	private String categorie;
	private String auteur;
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livre(String ref, String titre, String genre, String description, int annee_edition, String categorie ,
			String auteur) {
		super();
		this.ref = ref;
		this.titre = titre;
		this.genre = genre;
		this.description = description;
		this.annee_edition = annee_edition;
		this.categorie = categorie ;
		this.auteur = auteur;
	}

	public Livre(int id, String ref, String titre, String genre, String description, int annee_edition,
			String categorie, String auteur) {
		super();
		this.id = id;
		this.ref = ref;
		this.titre = titre;
		this.genre = genre;
		this.description = description;
		this.annee_edition = annee_edition;
		this.categorie = categorie;
		this.auteur = auteur;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAnnee_edition() {
		return annee_edition;
	}
	public void setAnnee_edition(int annee_edition) {
		this.annee_edition = annee_edition;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	@Override
	public String toString() {
		return "Livre [id=" + id + ", ref=" + ref + ", titre=" + titre + ", genre=" + genre + ", description="
				+ description + ", annee_edition=" + annee_edition + ", categorie=" + categorie + ", auteur=" + auteur
				+ "]";
	}
	
	
	

}