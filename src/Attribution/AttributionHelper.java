package Attribution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AttributionHelper {

	private static HashMap<String, ArrayList<Integer>> listeGroupes;

	public static void run(HashMap<String, ArrayList<Integer>> groupes) {
		AttributionHelper.listeGroupes = groupes;
		
		//while(listeGroupes.size() != 0) {
			tour();			
		//}
		/*
 * 		System.out.println(groupes.size());
 
		for (Map.Entry<String, ArrayList<Integer>> map : groupes.entrySet()) {
			System.out.println(map.getKey());
			System.out.print("Choix : ");
			for(int choix: map.getValue()) {
				System.out.print(choix + " ");
			}
			System.out.println("");		
		}
	*/	
	}

	private static void tour() {
		// Recuperation des choix en tête de liste
		HashMap<Integer, ArrayList<String>> choix = new HashMap<Integer, ArrayList<String>>();		
		for (Map.Entry<String, ArrayList<Integer>> map : listeGroupes.entrySet()) {
			if(map.getValue().size() != 0) {
				int c = map.getValue().get(0);
				if(choix.containsKey(c)) {
					choix.get(c).add(map.getKey());
				}else {
					ArrayList<String> tmp = new ArrayList<String>();
					tmp.add(map.getKey());
					choix.put(c, tmp);
				}		
			}
		}
		
		/** Debug */
		for (Map.Entry<Integer, ArrayList<String>> map : choix.entrySet()) {
			System.out.print(map.getKey() + " -> ");
			for(String c: map.getValue()) {
				System.out.print(c + " ");
			}
			System.out.println("");		
			
		}

	
	
	}

}
