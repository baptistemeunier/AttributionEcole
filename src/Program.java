import java.util.ArrayList;
import java.util.HashMap;

import Attribution.AttributionHelper;
import Attribution.GroupeFinal;
import CSVHelper.CSVReaderHelper;
import CSVHelper.CSVWriterHelper;

public class Program {
	
	public static void main(String[] args) {
		try {
			HashMap<String, ArrayList<Integer>> groupes = new HashMap<String, ArrayList<Integer>>();
			/** Lecture du fichier csv **/
			boolean data = CSVReaderHelper.parse("test.csv", groupes);

			/** Execution de l'algo **/
			ArrayList<GroupeFinal> attributions = AttributionHelper.run(groupes);

			/** Ecriture du fichier csv **/
			CSVWriterHelper.write("result.csv", attributions);

		} catch (Exception e) {
			System.out.println("Imposible de faire marcher le programme");
			e.printStackTrace();
		}
		
	}
	

}
