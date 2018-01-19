package CSVHelper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Attribution.GroupeFinal;

public class CSVWriterHelper {

	public static void write(String name, ArrayList<GroupeFinal> attributions) throws IOException {
		FileWriter fileWriter = new FileWriter(getAbsolutePath(name));
		for(GroupeFinal gf: attributions) {
			fileWriter.append(gf.getNom() + "," + gf.getChoix() + "\n");			
		}
		fileWriter.close();
	}

	private static String getAbsolutePath(String filename) {
		File f = new File("");
		return f.getAbsolutePath() + File.separator + filename;
	}

}
