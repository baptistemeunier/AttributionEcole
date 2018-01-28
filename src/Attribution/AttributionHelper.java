package Attribution;

import java.util.ArrayList;

public class AttributionHelper {

	private ArrayList<GroupeFinal> groupes;

	public AttributionHelper(ArrayList<GroupeFinal> groupes) {
		this.groupes = groupes;
	}

	public void run() {
		ArrayList<Integer> indexChoixEcole = new ArrayList<Integer>();
		ArrayList<ArrayList<GroupeChoix>> choixEcole = new ArrayList<ArrayList<GroupeChoix>>();

		/** Remplisage du tableau de choix ponderée **/
		boolean finish = false;
		int i = 0;
		
		while(!finish) {
			for(int id = 0; id < groupes.size(); id++) {
				ArrayList<Integer> listes = groupes.get(id).getListechoix();
				if(i < listes.size()) {
					finish = false;
					int c = listes.get(i);
					if(c != 0) {
						if(indexChoixEcole.contains(c)) {
							// Ajout à la liste de choixEcole
							choixEcole.get(indexChoixEcole.indexOf(c)).add(new GroupeChoix(id, i));
						} else {
							// Ajout d'un nouveau choixEcole
							indexChoixEcole.add(c);
							ArrayList<GroupeChoix> array = new ArrayList<GroupeChoix>();
							array.add(new GroupeChoix(id, i));
							choixEcole.add(array);
						}
					}
				}else {
					finish = true;
				}
			}
			i++;
		}
		
		for(i = 0; i < indexChoixEcole.size(); i++) {
			System.out.println("Ecole : " + indexChoixEcole.get(i));	
			int minValue = Integer.MAX_VALUE;
			ArrayList<Integer> g = new ArrayList<Integer>();
			for(GroupeChoix gc : choixEcole.get(i)) {
				System.out.println("Groupes : " + gc.getGroupe() + "poids : " + gc.getPoids());
				if(gc.getPoids() < minValue && groupes.get(gc.getGroupe()).naPasDeChoix()) {
					minValue = gc.getPoids();
					g.clear();	g.add(gc.getGroupe());
				}else if(gc.getPoids() == minValue && groupes.get(gc.getGroupe()).naPasDeChoix()) {
					g.add(gc.getGroupe());
				}
			}
			if(g.size() > 0) {
				int rand = (int)(Math.random() * g.size());
				groupes.get(g.get(rand)).setChoix(indexChoixEcole.get(i));
			}
		}
	}
}
