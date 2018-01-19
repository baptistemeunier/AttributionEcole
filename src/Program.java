import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Attribution.AttributionHelper;
import CSVHelper.CSVReaderHelper;

public class Program {

	public static void main(String[] args) {
		try {
			HashMap<String, ArrayList<Integer>> groupes = new HashMap<String, ArrayList<Integer>>();
			boolean data = CSVReaderHelper.parse("test.csv", groupes);
			AttributionHelper.run(groupes);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
