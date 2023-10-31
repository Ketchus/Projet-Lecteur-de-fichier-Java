package reader;

import java.io.File;
import java.io.IOException;

public class Lecteur {
    public static void main(String[] args) throws IOException {

        File text = new File("C:/Users/SONES/OneDrive/Bureau/Pojet_fichier/reader/fichier.txt");
        File text2 = new File("C:/Users/SONES/OneDrive/Bureau/Pojet_fichier/reader/Fichier.csv");
        
        System.out.println("Fichier txt");
        System.out.println("");
        Lecture_Normale t = new Lecture_Normale(text);
        t.affiche();
        System.out.println("----------------------------");
        
        Lecture_Inverse j = new Lecture_Inverse(text);
        j.afficheInv();
        System.out.println("----------------------------"); 

        Lecture_Palindromique k = new Lecture_Palindromique(text);
        k.affichePal();
        System.out.println("----------------------------"); 


        System.out.println(""); 
        System.out.println("Fichier csv"); 
        
        System.out.println("");
        Lecture_Normale t2 = new Lecture_Normale(text2);
        t2.affiche();
        System.out.println("----------------------------"); 

        Lecture_Inverse j2 = new Lecture_Inverse(text2);
        j2.afficheInv();
        System.out.println("----------------------------"); 

        Lecture_Palindromique k2 = new Lecture_Palindromique(text2);
        k2.affichePal();
        System.out.println("----------------------------");
    }
}
