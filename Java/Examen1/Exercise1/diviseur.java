package Examen1.Exercise1 ;
/*
 * Cirpaci, Léo
 * Exercise 1 : Examen 1 : class diviseur
 * 17 mars 2023
 */
import java.util.ArrayList;

public class diviseur {
    private ArrayList<Integer> diviseur = new ArrayList<Integer>();
    public diviseur(ArrayList<Integer> diviseur) {
        this.diviseur = diviseur ;
    }
    public void GetDiviseur(int nombre) {
        if (nombre < 0) return ;
        int controle = nombre ;
        while (controle != 0) {
            if ( nombre % controle == 0 ) {
               diviseur.add(controle) ;
            }
            controle -= 1 ;
        }
    }
    public ArrayList<Integer> GetListe() {
        return this.diviseur ;
    }
}