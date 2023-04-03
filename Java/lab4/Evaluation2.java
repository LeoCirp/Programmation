package lab4;
/*  Auteur : Léo Cirpaci
 *  Date : 23 Février 2023
 *  Programme : 1. Écrire une méthode statique qui permet de vérifier si un nombre est premier. Elle doit retourner true si le nombre est premier, false sinon.
 *  2. Testez votre méthode dans la méthode statique main en lui passant un nombre saisi au clavier par un utilisateur.
 *  3. Afficher un message indiquant si le nombre testé par la méthode est premier ou non.
 *  Description du programme : 
 *  Importer Scanner
 *  Méthode VerifierNombrePremier :
 *      importer un argument qui sera le nombre a controler
 *      Si le nombre est inférieur ou égal a 1, en retourne false 
 *      Boucle pour controler chaque chaque sous nombre
 *          Si le nombre diviser par l'index est égal a 0,
 *              return false    (met fin a la méthode)
 *      Fin boucle
 *      retourne true
 *  Méthode Main :
 *  Faire saisie depuis la console
 * associer une variable bool (resultat) avec la methode VerifierNombrePremier qui contient comme argument le nombre saisie
 * si resultat est vrai, il affiche qu'il est premier 
 * sinon il affiche qu'il est pas premier.
 */
import java.util.Scanner ;
public class Evaluation2 {
    public static boolean VerifierNombrePremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i < nombre; i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in) ;
        int nombre = sc.nextInt() ;
        sc.close();
        boolean resultat = VerifierNombrePremier(nombre) ;
        if (resultat ) {
            System.out.println("Le nombre : " + nombre + "est bien premier") ;
        } else 
        System.out.println("Le nombre : " + nombre + " n'est pas premier") ;
    }
}
