package Examen1.Exercise1 ;
/*
 * Cirpaci, Léo
 * Exercise 1 : Examen 1 : pacakge diviseur
 * 17 mars 2023
 */
import java.util.Scanner ;
import java.util.ArrayList ;

public class programme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Veuillez saisire un nombre positif") ;
        int nombre_saisie = sc.nextInt() ;
        sc.close() ; // fermer le scanner
        if (nombre_saisie < 0) {
            System.out.println("Erreur, vous n'avez pas saisie un nombre positif, veuillez restart le programme.");
            return ;
        }
        diviseur a = new diviseur(new ArrayList<Integer>()) ;
        a.GetDiviseur(nombre_saisie) ;
        System.out.println(a.GetListe()) ;
    }
}
