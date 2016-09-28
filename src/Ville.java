public class Ville {
	//Attributs
		private String nomVille;
		private int nbHabitantsVille;
		private double superficieVille;
		//Constructeur
		public Ville(String unNomVille, int unNbHabitantsVille, double uneSuperficieVille){
			this.nomVille = unNomVille;
			this.nbHabitantsVille = unNbHabitantsVille;
			this.superficieVille = uneSuperficieVille;
		}
		//Accesseurs
		public String getNomVille(){
			return(this.nomVille);
		}
		public int getNbHabitantsVille(){
			return(this.nbHabitantsVille);
		}
		public double getSuperficieVille(){
			return(this.superficieVille);
		}
		public void setNomCapitale(String unNomVille){
			this.nomVille = unNomVille;
		}
		public void setNbHabitants(int unNbHabitantsVille){
			this.nbHabitantsVille = unNbHabitantsVille;
		}
		public void setSuperficie(double uneSuperficieVille){
			this.superficieVille = uneSuperficieVille;
		}
		//Méthodes
		public String afficherVille(){
			return("\nNom de la ville: " + this.nomVille + "\nNombre d'habitants: " + this.nbHabitantsVille + "\nSuperficie: " + this.superficieVille + "km²\n");
		}
}