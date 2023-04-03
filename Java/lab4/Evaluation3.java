package lab4;
/*  Auteur : Léo Cirpaci
 *  Date : 23 Février 2023
 *  Programme : 1. Écrire une méthode statique qui permet de convertir un tableau statique en un tableau dynamique de type ArrayList. La méthode doit prendre en paramètre un
 *  tableau statique et retourner un tableau dynamique de même type.
 *  2. Testez votre méthode dans la méthode statique main en lui passant le tableau [80, 90, 95, 70, 30, 80].
 *  3. Afficher le tableau dynamique retourné par la méthode.
 *  Description du programme : 
 *  Importer ArrayList
 *  Méthode TransfertVersArrayList :
 *      Importation d'un argument qui sera l'ancien tableau a copier
 *      déclaration d'une table avec ArrayList (Nouvelle)
 *      Boucle sur le contenu du tableaux (utilisation d'Index int)
 *          Ajouter l'element de Ancen dans Nouvelle
 *      Retoruner la table nouvelle
 *  Méthode Main :
 * Déclaration et initialisation du tableau
 * Déclarer le tableau Nouvelle avec la fonction TransfertVersArrayList contenu le tableau initialiser en haut ( car elle a était cree dans une methode )
 * Afficher le contenu de nouvelle
 */
import java.util.ArrayList ;
public class Evaluation3 {
    public static ArrayList<Integer> TransfertVersArrayList(int[] Ancienne) {
        ArrayList<Integer> Nouvelle = new ArrayList<Integer>();
        for (int i = 0 ; i < Ancienne.length ; i++ ) {
            Nouvelle.add(Ancienne[i]) ;
        }
        return Nouvelle ;
    }
    public static void main(String[]args) {
        int [] Tableau = {80, 90, 95, 70, 30, 80} ;
        ArrayList<Integer> Nouvelle = TransfertVersArrayList(Tableau) ;
        System.out.println(Nouvelle);
    }
}