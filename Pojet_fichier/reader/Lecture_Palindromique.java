package reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecture_Palindromique extends Lecture_Normale {
    List<String> lines = new ArrayList<>();

    public Lecture_Palindromique(File texte) {
        super(texte);
    }

    public File getTexte() {
        return this.texte;
    }

    public File toFile() {
        return this.texte;
    }

    public String affichePal() throws IOException {
        try {
            Scanner scanner = new Scanner(this.texte);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Inverser la ligne
                String reversedLine = reverseString(line);
                lines.add(reversedLine);
            }

            scanner.close();

            // Afficher les lignes inversées
            for (String reversedLine : lines) {
                System.out.println(reversedLine);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    // Méthode pour inverser une chaîne de caractères
    private String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input.length());
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
