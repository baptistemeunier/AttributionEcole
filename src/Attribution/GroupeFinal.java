package Attribution;

public class GroupeFinal {
	private String nom;
	private int choix;
	
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
	
	public String toString() {
		return this.nom + " -> " + this.choix;
	}
}
