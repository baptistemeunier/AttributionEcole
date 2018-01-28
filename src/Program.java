import java.util.ArrayList;

import Attribution.AttributionHelper;
import Attribution.GroupeFinal;
import CSVHelper.CSVReaderHelper;
import CSVHelper.CSVWriterHelper;

public class Program {
	
	public static void main(String[] args) {
		try {
			ArrayList<GroupeFinal> groupes = new ArrayList<GroupeFinal>();
			/** Lecture du fichier csv **/
			CSVReaderHelper.parse("test.csv", groupes);

			/** Execution de l'algo **/
			AttributionHelper ah = new AttributionHelper(groupes);
			ah.run();

			/** Ecriture du fichier csv **/
			CSVWriterHelper.write("result.csv", groupes);

		} catch (Exception e) {
			System.out.println("Imposible de faire marcher le programme");
			e.printStackTrace();
		}
		
	}
	

}
