public class Capitale {
	//Attributs
	private String nomCapitale;
	private int nbHabitantsCapitale;
	private double superficieCapitale;
	//Constructeur
	public Capitale(String unNomCapitale, int unNbHabitantsCapitale, double uneSuperficieCapitale){
		this.nomCapitale = unNomCapitale;
		this.nbHabitantsCapitale = unNbHabitantsCapitale;
		this.superficieCapitale = uneSuperficieCapitale;
	}
	//Accesseurs
	public String getNomCapitale(){
		return(this.nomCapitale);
	}
	public int getNbHabitantsCapitale(){
		return(this.nbHabitantsCapitale);
	}
	public double getSuperficieCapitale(){
		return(this.superficieCapitale);
	}
	public void setNomCapitale(String unNomCapitale){
		this.nomCapitale = unNomCapitale;
	}
	public void setNbHabitants(int unNbHabitantsCapitale){
		this.nbHabitantsCapitale = unNbHabitantsCapitale;
	}
	public void setSuperficie(float uneSuperficieCapitale){
		this.superficieCapitale = uneSuperficieCapitale;
	}
	//Méthodes
	public String afficherCapitale(){
		return("\n---Capitale---\nNom de la capitale: " + this.nomCapitale + "\nNombre d'habitants: " + this.nbHabitantsCapitale + "\nSuperficie: " + this.superficieCapitale + "km²");
	}
}