import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Attribution.AttributionHelper;
import Attribution.GroupeFinal;
import CSVHelper.CSVReaderHelper;

public class Program {

	public static void main(String[] args) {
		try {
			HashMap<String, ArrayList<Integer>> groupes = new HashMap<String, ArrayList<Integer>>();
			boolean data = CSVReaderHelper.parse("test.csv", groupes);
			ArrayList<GroupeFinal> attributions = AttributionHelper.run(groupes);
			for(GroupeFinal gf: attributions) {
				System.out.println(gf);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
