package lab4;
/*  Auteur : Léo Cirpaci
 *  Date : 23 Février 2023
 *  Programme : 1. Écrire une méthode statique qui permet de retourner la différence entre le maximum et le minimum d’un tableau.
 *  2. Testez votre méthode dans la méthode statique main en lui passant le tableau [80, 90, 95, 70, 30, 80]
 *  3. Afficher le résultat retourné par la méthode.
 *  Description du programme :
 * 
 * Méthode TrouverMinMax :
 *  Importer un argument que sera la table a trier
 *  Initialiser les variables int minimum et int maximum a la première valeur du tableux importer
 *  pour chaque element du tableaux (utilisation de la distance pour le controle des index) 
 *      Controler si l'element est plus bas que l'element
 *          Si ces le cas, assigner la valeur a minimum
 *      Controler si l'element est plus grand que maximum
 *          Si ces le cas, assigner la valeur a maximum
 *      Repeter pour chaque element
 *  Fin de la boucle for
 *  Retoruner dans une tables les elements minimum et maximim
 * Méthode Main :
 *  Charger la table prédéfinie nommer Liste
 *  associer un table nommer resultat a la méthode Méthode TrouverMinMax avec comme argument la table prédéfinie (Liste)
 *  Associer les variables minimum et maximum avec la table resultat avec les index approprier
 *  Afficher le minimum et le maximum
 */
public class Evaluation1 {
    public static int[] TrouverMinMax(int[] Liste) {
        int minimum = Liste[0];
        int maximum = Liste[0];
        for (int i = 0; i < Liste.length; i++) {
            if (Liste[i] < minimum) {
                minimum = Liste[i];
            }
            if (Liste[i] > maximum) {
                maximum = Liste[i];
            }
        }
        int[] resultat = {minimum, maximum};
        return resultat;
    }
    public static void main(String[] args) {
        System.out.println("1. Écrire une méthode statique qui permet de retourner la différence entre le maximum et le minimum d’un tableau.");
        System.out.println("2. Testez votre méthode dans la méthode statique main en lui passant le tableau [80, 90, 95, 70, 30, 80]");
        System.out.println("3. Afficher le résultat retourné par la méthode.");
        int[] index = {80, 90, 95, 70, 30, 80};
        int[] resultat = TrouverMinMax(index);
        int minimum = resultat[0];
        int maximum = resultat[1];
        int difference = maximum - minimum ;
        //System.out.println("Le minimum est " + minimum);
        //System.out.println("Le maximum est " + maximum);
        System.out.println("La différence est " + difference);
    }
}