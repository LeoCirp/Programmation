package lab2 ;
/*  Auteur : Léo Cirpaci
 *  Collaboratuer : Jean Baptiste Dave & Tahmid Bashar
 *  Date : 9 Février 2023
 *  Programme : Calculer et afficher la somme des nombres pairs de 1 à 1000.
 *  Description du programme : 
 * Utilisation de la méthode main avec une class portant le nom du fichier
 * Initialisation d'une variable integrale avec l'ValeurRechercher des nombres par 0
 * Utilisation d'une boucle FOR pour controler chaque nombre paires entre 1 et 1000 (Ajout de plus 2 pour l'indice)
 * ValeurRechercherer a la variable ValeurRechercher, l'indice
 * Fin de la boucle pour controler chaque nombrepaires entre 1 et 1000
 * Afficher le resultat
 */
public class Evaluation2 {
    public static void main(String[] args) {
        System.out.println("Programme permetant de Calculer et afficher la somme des nombres pairs de 1 à 1000.");
        int ValeurRechercher = 0 ;
        for (int i = 0 ; i <= 1000 ; i+=2) {
            ValeurRechercher += i ;
        }
        System.out.println("La Somme paires entre 1 et 1000 est " + ValeurRechercher);
    }
}