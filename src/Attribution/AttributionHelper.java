package Attribution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AttributionHelper {

	private ArrayList<GroupeFinal> groupes;
//	private static ArrayList<Integer> choixDejaAttrib;

	public AttributionHelper(ArrayList<GroupeFinal> groupes) {
		this.groupes = groupes;
	}

	public void run() {
		/** Remplisage du tableau de choix ponderée **/
		int[][] choixPondereeEcole = new int[groupes.get(0).getListechoix().size()][groupes.size()];
		//[6, 5, 8, 9]
		for(int id = 0; id < groupes.size(); id++) {
			int poids = 1;
			for(int c: groupes.get(id).getListechoix()) {
				choixPondereeEcole[c-1][id] = poids;
				poids++;
			}
		}
		
		for(int i = 0; i < choixPondereeEcole.length; i++) {
			int minValue = Integer.MAX_VALUE;
			ArrayList<Integer> g = new ArrayList<Integer>();
			for(int j = 0; j < choixPondereeEcole[i].length; j++) {
				if(choixPondereeEcole[i][j] < minValue && groupes.get(j).naPasDeChoix()) {
					minValue = choixPondereeEcole[i][j];
					g.clear();	g.add(j);
				}else if(choixPondereeEcole[i][j] == minValue && groupes.get(j).naPasDeChoix()) {
					g.add(j);					
				}
			}
			int rand = (int)(Math.random() * g.size());
			groupes.get(g.get(rand)).setChoix(i+1);
		}
	}
}
