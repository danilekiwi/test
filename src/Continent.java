import java.util.ArrayList;
public class Continent {
	//Attributs
	private String nomContinent;
	private ArrayList<Pays> lesPays;
	//Constructeur
	public Continent(String unNom, ArrayList<Pays>uneListePays){
		this.nomContinent = unNom;
		this.lesPays = new ArrayList<Pays>();
		this.lesPays = uneListePays;
	}
	//Accesseurs
	public String getNomContinent(){
		return(this.nomContinent);
	}
	public ArrayList<Pays> getLesPays(){
		return(this.lesPays);
	}
	//Méthodes
	@Override
	public String toString(){
		String chaine = null;
		for(Pays pays:this.lesPays){
			chaine = "\n---" + this.nomContinent + "---\n" + pays.afficherPays();
		}
		return(chaine);
	}
	public void ajouterPays(Pays unPays){
		this.lesPays.add(unPays);
	}
	public String rechercherPays(String unNom){
		int i = 0;
		String chaine = "Ce pays n'existe pas.";
		while(i < this.lesPays.size() && !unNom.equals(this.lesPays.get(i).getNomPays())){
			i++;
		}
		if(i < this.lesPays.size()){
			chaine = this.lesPays.get(i).afficherPays();
		}
		return(chaine);
	}
	public void supprimerPays(int position){
		if(position < this.lesPays.size()){
			System.out.println("La ville de " + this.lesPays.get(position).getNomPays() + " a bien été supprimé.\n");
			this.lesPays.remove(position);
		}
		else{
			System.out.println("L'index entré correspond à aucun pays.");
		}
	}
	public void supprimerPays(String unNom){
		int i = 0;
		while(i < this.lesPays.size() && !unNom.equals(this.lesPays.get(i).getNomPays())){
			i++;
		}
		if(i < this.lesPays.size()){
			System.out.println("Le pays " + this.lesPays.get(i).getNomPays() + " a bien été supprimé.\n");
			this.lesPays.remove(i);
		}
		else{
			System.out.println("Le pays " + unNom + " n'existe pas.");
		}
	}
}
