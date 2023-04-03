package lab2 ;
/*  Auteur : Léo Cirpaci
 *  Collaboratuer : Jean Baptiste Dave & Tahmid Bashar
 *  Date : 9 Février 2023
 *  Programme : Lire 10 notes de différentes évaluations pour chacun des 17 élèves et afficher la moyenne de
 * chacun des élèves et la moyenne de la classe.
 *  Description du programme : 
 * Importation du module Scanner pour faire des saisies
 * Utilisation de la méthode main avec une class portant le nom du fichier
 * Initialisation de deux constante (MAX_ETUDIANT & MAX_EVALUATION) étant les nombres d'étudiants (17) et d'évaluations (10)
 * Déclaration de la variable (noteEtudiant) float pour la note de l'étudiant (Elle sera reinisialiser a chaque nouveu etudiant dans la boucle for)
 * Initialisation d'une variable (MoyenneGlobal) pour la moyenne Global a 0
 * Utilisation d'une boucle FOR pour controler chaque étudiant
 * Initialisation de la variables noteEtudiant a 0
 * Utilisation d'une boucle FOR pour controler chaque évaluation
 * Faire une saisie de note et l'additioner a NoteEtudiant
 * Fin de la boucle pour les évaluations
 * Initialisation de la variable MoyenneEtudiant en divisant le cumulé des NoteEtudiant par MAX_EVALUATION
 * Afficher le resultat avec l'indice de l'Étuidant (indice de la première boucle FOR) et MoyenneEtudiant
 * Ajouter a MoyenneGlobal, la valeur de MoyenneEtudiant
 * Fin de la boucle pour les étudiants
 * Initialisation de la variable MoyenneGlobal en divisant MoyenneGlobal par MAX_ETUDIANT
 * Afficher le resultat
 */
import java.util.Scanner;
public class Evaluation1 {
    public static void main(String[] args) {
        System.out.println("Programme permettant de Lire 10 notes de différentes évaluations pour chacun des 17 élèves et afficher la moyenne de chacun des élèves et la moyenne de la classe.");
        final int MAX_ETUDIANT = 17 ;
        final int MAX_EVALUATION = 10 ;

        float NoteEtudiant ;
        float MoyenneGlobal = 0 ;

        for ( int IndicationEtudiant = 1 ; IndicationEtudiant < MAX_ETUDIANT + 1 ; IndicationEtudiant++ ) {
            NoteEtudiant = 0 ;
            for ( int IndicationEvaluation = 0 ; IndicationEvaluation < MAX_EVALUATION ; IndicationEvaluation++ ) {
                System.out.println("Veuillez faire une saisie de note en lien avec l'étudiant : " + IndicationEtudiant + " (" + (IndicationEvaluation + 1) + "/" + MAX_EVALUATION + ")");
                try (Scanner Note = new Scanner(System.in)) {
                    NoteEtudiant += Note.nextFloat() ;
                }
            }
            float MoyenneEtudiant = NoteEtudiant / MAX_EVALUATION ;
            System.out.println("Moyenne de l'Étudiant " + IndicationEtudiant + " est " + MoyenneEtudiant);
            MoyenneGlobal += MoyenneEtudiant ;
        }
        MoyenneGlobal = MoyenneGlobal / MAX_ETUDIANT ;
        System.out.println("Moyenne du groupe est " + MoyenneGlobal);

    }
}
