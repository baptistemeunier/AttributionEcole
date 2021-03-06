package CSVHelper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Attribution.GroupeFinal;

public class CSVReaderHelper {

	public static boolean parse(String filename, ArrayList<GroupeFinal> groupes) throws IOException {
		String path = CSVReaderHelper.getAbsolutePath(filename);
		System.out.println("Le chemin source est : " + path);
		File f = new File(path);
		readFile(f, groupes);
		return false;
	}

	private static void readFile(File f, ArrayList<GroupeFinal> groupes) throws IOException {		
		FileReader fr = new FileReader(f);
		BufferedReader buffer = new BufferedReader(fr);
		buffer.readLine();
		for(String line = buffer.readLine(); line != null; line = buffer.readLine()) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			String[] col = line.split(",");
			for(int i = 1; i < col.length; i++) {
				int n;
				try {
					n = Integer.parseInt(col[i]);
				}catch(Exception e) {
					n = 0;
				}
				tmp.add(n);
			}
			groupes.add(new GroupeFinal(col[0], tmp));		
		}
		buffer.close();
	}

	private static String getAbsolutePath(String filename) {
		File f = new File("");
		return f.getAbsolutePath() + File.separator + filename;
	}

}
