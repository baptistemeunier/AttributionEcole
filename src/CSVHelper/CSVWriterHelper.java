package CSVHelper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Attribution.GroupeFinal;
/**
 * Class qui permet de gérer l'écriture des fichiers .csv
 * @author baptiste
 */
public class CSVWriterHelper {
	/**
	 * Permet d'écrire la liste final des groupes dans un fichier .csv
	 * @param String name Nom du fichier à l'exporation
	 * @param ArrayList<GroupeFinal> attributions Liste des groupes avec leur école
	 * @throws IOException Erreur lorsque qu'il est imposible d'écrire dans le dossier
	 */
	public static void write(String name, ArrayList<GroupeFinal> attributions) throws IOException {
		
		FileWriter fileWriter = new FileWriter(getAbsolutePath(name));
		/** Ajout de chaque groupe un à un **/
		for(GroupeFinal gf: attributions) {
			fileWriter.append(gf.getNom() + "," + gf.getChoix() + "\n");			
		}
		fileWriter.close();
	}

	/**
	 * Permet de récuperer le chemin relatif d'un fichier
	 * @param String filename chemin du fichier en absolue 
	 * @return
	 */
	private static String getAbsolutePath(String filename) {
		File f = new File("");
		return f.getAbsolutePath() + File.separator + filename;
	}
}