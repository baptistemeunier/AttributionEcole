package Attribution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AttributionHelper {

	private static HashMap<String, ArrayList<Integer>> listeGroupes;
	private static ArrayList<GroupeFinal> attributions;
	private static ArrayList<Integer> choixDejaAttrib;

	public static ArrayList<GroupeFinal> run(HashMap<String, ArrayList<Integer>> groupes) {
		AttributionHelper.listeGroupes = groupes;
		attributions = new ArrayList<GroupeFinal>();
		choixDejaAttrib = new ArrayList<Integer>();
		int nb = 0;
		while(listeGroupes.size() != 0) {
			tour(nb);
			nb++;
		}
		return attributions;
	}

	private static void tour(int nb) {
		// Recuperation des choix en tête de liste
		HashMap<Integer, ArrayList<String>> choix = new HashMap<Integer, ArrayList<String>>();		
		for (Map.Entry<String, ArrayList<Integer>> map : listeGroupes.entrySet()) {
			if(map.getValue().size() != 0) {
				int c = map.getValue().get(nb);
				if(!choixDejaAttrib.contains(c)) {
					if(choix.containsKey(c)) {
						choix.get(c).add(map.getKey());
					}else {
						ArrayList<String> tmp = new ArrayList<String>();
						tmp.add(map.getKey());
						choix.put(c, tmp);
					}					
				}
			}
		}
		
		for (Map.Entry<Integer, ArrayList<String>> map : choix.entrySet()) {
			int rand = (int)(Math.random() * map.getValue().size());
			attributions.add(new GroupeFinal(map.getValue().get(rand), map.getKey()));
			System.out.print(map.getKey() + " -> ");
			for(String c: map.getValue()) {
				System.out.print(c + " ");
			}
			listeGroupes.remove(map.getValue().get(rand));
			choixDejaAttrib.add(map.getKey());
			System.out.println("");
		}
	}

}
