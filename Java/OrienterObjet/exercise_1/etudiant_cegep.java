package OrienterObjet.exercise_1;

import java.util.ArrayList;

//import java.lang.ProcessBuilder.Redirect;

public class etudiant_cegep extends etudiant {
    private ArrayList<String> cours ;
     etudiant_cegep(String nom, int age) {
        super(nom,age) ;
     }
     // #constructeur par défaut
     etudiant_cegep() {
        super() ;
     }
     // #constructeur cours
     etudiant_cegep(String nom, int age, ArrayList<String> cours) {
        super(nom,age) ;
        this.cours = cours;
     }
     public String ToString() {
        return super.toString() + " Cours : " + this.cours ;
     }

}
