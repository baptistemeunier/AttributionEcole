package Attribution;

import java.util.ArrayList;

/**
 * Permet de representer un couple Groupe/Choix d'école
 * @author baptiste
 */
public class GroupeFinal {
	private String nom;
	private int choix = -1;
	private ArrayList<Integer> listechoix;
	
	public GroupeFinal(String nom, ArrayList<Integer> liste) {
		this.nom = nom;
		this.listechoix = liste;
	}

	public GroupeFinal(String nom, Integer choix) {
		this.nom = nom;
		this.choix = choix;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return the choix
	 */
	public int getChoix() {
		return choix;
	}
	/**
	 * @param choix the choix to set
	 */
	public void setChoix(int choix) {
		this.choix = choix;
	}
	
	public ArrayList<Integer> getListechoix() {
		return listechoix;
	}

	public boolean naPasDeChoix() {
		return this.choix == -1;
	}
	public String toString() {
		return this.nom + " -> " + this.choix;
	}
}
