import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Martinique
		Capitale fortDeFrance = new Capitale("Fort-de-France",90347,44.21);
		ArrayList<Ville>villeMartinique  = new ArrayList<Ville>();
		Pays martinique = new Pays("mARTINIQUE","Créole","€",fortDeFrance,villeMartinique);
		martinique.ajouterVille(new Ville("Saint-Pierre",13600,38.72));
		martinique.ajouterVille(new Ville("Rivière-Pilote",12359,35.78));
		martinique.ajouterVille(new Ville("Case-Pilote",4447,18.44));
		ArrayList<Pays>paysAmerique = new ArrayList<Pays>();
		Continent amerique = new Continent("Amerique",paysAmerique);
		amerique.ajouterPays(martinique);
		affichageContinent(amerique);
		//Allemagne
		Capitale berlin = new Capitale("Berlin",3502000,891.8);
		ArrayList<Ville>villeAllemagne = new ArrayList<Ville>();
		Pays allemagne = new Pays("aLLEMAGNE","Allemand","€",berlin,villeAllemagne);
		allemagne.ajouterVille(new Ville("Stuttgart",597939,216.4));
		allemagne.ajouterVille(new Ville("Munich",1388000,310.4));
		allemagne.ajouterVille(new Ville("Hambourg",1734000,755.2));
		ArrayList<Pays>paysEurope = new ArrayList<Pays>();
		Continent europe = new Continent("Europe",paysEurope);
		europe.ajouterPays(allemagne);
		affichageContinent(europe);
	}
	//Affiche la chaine renvoyé par la méthode toString()
	public static void affichageContinent(Continent unContinent){
		System.out.print(unContinent.toString());
	}
	//Affiche la valeur de compteurPays dans la classe Pays
	public static void affichageNbPays(){
		int nbPays;
		nbPays = Pays.getCompteurPays();
		System.out.println("\n\nNombre de pays: " + nbPays + "\n");
	}
}