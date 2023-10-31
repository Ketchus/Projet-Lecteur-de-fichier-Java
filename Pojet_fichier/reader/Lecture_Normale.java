package reader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lecture_Normale{
    protected File texte;

    public Lecture_Normale(File texte) {
        this.texte = texte;
    }

    public File getTexte() {
        return this.texte;
    }

    public File toFile() {
        return  this.texte;
    }

    public String affiche() throws IOException{
        try {
            Scanner scanner = new Scanner(this.texte);  

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();    
            }
            catch (Exception e){
            e.getStackTrace();
        }
        return null;
    }

}
