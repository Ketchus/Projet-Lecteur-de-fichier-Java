package reader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lecture_Inverse extends Lecture_Normale{

    List<String> lines = new ArrayList<>();

    public Lecture_Inverse(File texte) {
        super(texte);
    }

    public File getTexte() {
        return this.texte;
    }
    
    public File toFile() {
        return this.texte;
    }
    

    public String afficheInv() throws IOException{
        try {
            Scanner scanner = new Scanner(this.texte);  

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                lines.add(line);
            }
            scanner.close();    
            // Inverser la liste des lignes
            Collections.reverse(lines);
            // Afficher les lignes dans l'ordre inverse
            for (String line : lines) {
                System.out.println(line);
            }       

            }catch (Exception e){
            e.getStackTrace();
        }
        return null;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

}
