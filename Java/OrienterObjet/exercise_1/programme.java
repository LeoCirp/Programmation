package OrienterObjet.exercise_1 ;
/*
 # Agrégation
 ? Etudiant du cégep sont des étudiants, mais les etudiant ne sont pas tous des cegep
 */
import java.util.ArrayList;
public class programme {
    public static void main(String[] args) {
        etudiant e1 = new etudiant("Martin", 17) ;
        System.out.println("Étudiant e1 : "+e1.ToString()) ;
        etudiant c1 = new etudiant_cegep("Lise",10) ;
        System.out.println("Étudiant c1 : "+c1.ToString()) ;
        etudiant e2 = new etudiant() ;
        System.out.println("Étudiant e2 : "+e2.ToString()) ;
        etudiant c2 = new etudiant_cegep() ;
        System.out.println("Étudiant c2 : "+c2.ToString()) ;
        c1.nom = "martin" ;
        System.out.println(c1.nom) ; // ? dans le meme package
        // ? si private, alors pas accesible, seulement dans le fichier etudiant.java
        ArrayList<String> cours = new ArrayList<>() ;
        cours.add("French") ;
        cours.add("Philosophie") ;
        etudiant_cegep c3 = new etudiant_cegep("Marcp",19,cours) ;
        System.out.println(c3.ToString());
    }
}