import java.util.ArrayList;
public class Pays {
	//Attributs
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale capitale;
	private ArrayList<Ville>lesVilles;
	private static int compteurPays = 0;
	//Constructeur
	public Pays(String unNom, String uneLangue, String uneMonnaie, Capitale uneCapitale, ArrayList<Ville>uneCollecVille){
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.capitale = uneCapitale;
		this.lesVilles = new ArrayList<Ville>();
		this.lesVilles = uneCollecVille;
		compteurPays++;
	}
	//Accesseurs
	/**
	* Description:
	* @author Nero Maxime
	* @return Cette méthode retourne la valeur de l'attribut nom de l'objet
	*/
	public String getNomPays(){
		return(this.nom);
	}
	/**
	* Description:
	* @author Nero Maxime
	* @param unNom contient une chaine qui remplacera la valeur de l'attribut nom de l'objet
	*/
	public void setNomPays(String unNom){
		this.nom = unNom;
	}
	public ArrayList<Ville> getLesVilles(){
		return(this.lesVilles);
	}
	/**
	* Description:
	* @author Nero Maxime
	* @return Cette méthode retourne la valeur de l'attribut compteurPays
	*/
	public static int getCompteurPays(){
		return(compteurPays);
	}
	//Méthodes
	/**
	* Description:
	* @author Nero Maxime
	* @return Cette méthode retourne une chaine avec la valeur de chaque attribut de l'objet Pays
	*/
	public String afficherPays(){
		String affichage;
		affichage ="---Pays---\nNom: " + formeNom() + "\nLangue: " + this.langue + "\nMonnaie: " + this.monnaie + this.capitale.afficherCapitale() + "\n---Villes---";
		for(Ville ville: this.lesVilles){
			affichage += ville.afficherVille();
		}
		return(affichage);
	}
	/**
	* Description
	* @author Nero Maxime
	* @return Cette méthode retourne l'attribut nom de la classe Pays en majuscule
	*/
	public String nomMajuscule(){
		return(this.nom.toUpperCase());
	}
	/**
	* Description:
	* @author Nero Maxime
	* @return Cette méthode retourne l'attribut nom de la classe Pays sous la forme "Nom"
	*/
	private String formeNom(){
		//Variables
		char premiereLettre;
		String strPremiereLettre;
		String suiteNom;
		int longueurNom;
		//Récupère le premier caractère du nom et le met en majuscule dans la variable strPremiereLettre
		premiereLettre = this.nom.charAt(0);
		strPremiereLettre = Character.toString(premiereLettre).toUpperCase();
		//Supprime le premier caractère du nom et stocke le reste du nom en minuscule dans la variable suiteNom
		longueurNom = this.nom.length();
		suiteNom = this.nom.substring(1,longueurNom).toLowerCase();
		return(strPremiereLettre + suiteNom);
	}
	/**
	* Description:
	* Cette méthode ajoute un objet ville dans l'attribut lesVilles
	* @author Nero Maxime
	*/
	public void ajouterVille(Ville uneVille){
		this.lesVilles.add(uneVille);
	}
	public String rechercherVille(String unNom){
		int i = 0;
		String chaine = "Cette ville n'existe pas.";
		while(i < this.lesVilles.size() && !unNom.equals(this.lesVilles.get(i).getNomVille())){
			i++;
		}
		if(i < this.lesVilles.size()){
			chaine = this.lesVilles.get(i).afficherVille();
		}
		return(chaine);
	}
	public void supprimerVille(int position){
		if(position < this.lesVilles.size()){
			System.out.println("La ville de " + this.lesVilles.get(position).getNomVille() + " a bien été supprimé.\n");
			this.lesVilles.remove(position);
		}
		else{
			System.out.println("L'index entré correspond à aucune ville.");
		}
	}
	public void supprimerVille(String unNom){
		int i = 0;
		while(i < this.lesVilles.size() && !unNom.equals(this.lesVilles.get(i).getNomVille())){
			i++;
		}
		if(i < this.lesVilles.size()){
			System.out.println("La ville de " + this.lesVilles.get(i).getNomVille() + " a bien été supprimé.\n");
			this.lesVilles.remove(i);
		}
		else{
			System.out.println("La ville de " + unNom + " n'existe pas.");
		}
	}
}