package Attribution;

public class GroupeChoix {
	private int groupe;
	private int poids;
	
	GroupeChoix(int g, int p) {
		groupe = g;
		poids = p;
	}
	
	public int getGroupe() {
		return groupe;
	}
	
	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}
	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}
	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}
}
