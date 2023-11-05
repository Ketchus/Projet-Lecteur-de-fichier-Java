package reader;

import java.io.File;

public class ComparateurFichier {

    public static boolean ontMemeExtension(File fichier1, File fichier2) {
        if (fichier1 != null && fichier2 != null && fichier1.exists() && fichier2.exists()) {
            String extensionFichier1 = getFileExtension(fichier1);
            String extensionFichier2 = getFileExtension(fichier2);
            return extensionFichier1.equalsIgnoreCase(extensionFichier2);
        }
        return false;
    }

    private static String getFileExtension(File fichier) {
        String nomFichier = fichier.getName();
        int dernierPoint = nomFichier.lastIndexOf('.');
        if (dernierPoint != -1) {
            return nomFichier.substring(dernierPoint + 1);
        }
        return ""; // Retourne une chaîne vide si l'extension n'est pas trouvée.
    }

    public static void main(String[] args) {
        File fichier1 = new File("C:/chemin/vers/fichier1.txt");
        File fichier2 = new File("C:/chemin/vers/fichier2.csv");

        boolean ontMemeExtension = ontMemeExtension(fichier1, fichier2);

        if (ontMemeExtension) {
            System.out.println("Les deux fichiers ont la même extension.");
        } else {
            System.out.println("Les deux fichiers n'ont pas la même extension.");
        }
    }

    
}
