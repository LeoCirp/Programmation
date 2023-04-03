package lab2 ;
/*  Auteur : Léo Cirpaci (Block 1) Jean Baptiste Dave (Block 2)
 *  Collaboratuer : Tahmid Bashar
 *  Date : 9 Février 2023
 *  Programme : Écrire un programme qui réalise de style piramine avec contraintre de saut de ligne
 *  Description du programme :
 * Initialisation d'une variable char contenant le symbole (SIGNE) = 1
 * Utilisation de deux méthode différente
 * Block 1 réaliser par Léo Cirpaci
 * Initialisation de variable constante de type integrale avec le maximum de ligne (MAX_LIGNE) et de la distance de l'affiche (MAX_DISTANCE)
 * Initialisation des positions de controle (LigneActuel) et (DistanceAcutel) par 1
 * Déclaration d'une varaible de controle (OldDistance)
 * Initialisation du numero de la ligne a faire le saut (LigneToSkip)
 * Initialisation d'une variable boolean (ModeDescendant) permettant de controler si on devrais faire une distance vers la gauche ou la droite ( pour la Méthode 1)
 *  Création de l'opératuer logique do
 *      Assignation des variable de controle par les valeurs actules
 *      Si ModeDescendant est vrai
 *          boucle commencant par 0 jsute qu'a la DistanceActuel en ajoutant 1
 *              Controler si la LigneActuel n'est pas égal a la la ligne a faire le saut (LigneToSkip)
 *                  Si vrai, alors Afficher sans saut de ligne les signes
 *          Fin Boucle
 *          Controler si la LigneActuel n'est pas égal a la la ligne a faire le saut (LigneToSkip)
 *            []Si vrai, alors on actualise la DistanceActuel par + 1 
 *              Actualiser LigneActuel par + 1
 *              Afficher un saut de ligne
 *              {}Si DistanceActuel est égal au maximum + 1, alors en retourne la valeur boolean false pour Mettre l'affiche vers le cote gauche
 *      Sinon
 *              Meme étape que la condition ModeDescendant sauf au ligne ou il y a un
 *              [] ou est ce que ca vas etre un -1
 *              {} ou est ce que sa vas etre comparer a si DistanceActuel est égal a 1, alors retorun boolean true
 *  Fin du bloque logique do tantque LigneActuel est égal Maximum
 * Block 2 réaliser par Jean Baptiste Dave
 */
public class Evaluation3 {
    public static void main(String[] args) {
        // Message de présentation du script
        System.out.println("Programme permettant de faire un affiche de type triangle avec une variable char");

        // Block 1 par Léo Cirpaci

        // les limites
        final int MAX_LIGNE = 18 ;
        final int MAX_DISTANCE = 9 ;
        final char SIGNE = '1' ;
        // Initialiser le débart
        int LigneActuel = 1 ;
        int DistanceActuel = 1;
        // Controle
        // Exeception a ne pas afficher
        int LigneToSkip = 9 ;
        // controle de si ces depuis la gauche ou la droite
        boolean ModeDescendant = true ;
        do {
            // permet de faire des ajouts en fonction de condition spécifique a la distance

            if (ModeDescendant) {
                // Repeter l'opération d'affichage par rapport a la DistanceActuel
                for (int RepetitionDeLinstruction = 0 ; RepetitionDeLinstruction < DistanceActuel ; RepetitionDeLinstruction ++ ) {
                    if (!(LigneToSkip == LigneActuel)) {System.out.print(SIGNE);}
                }
                // operation de controle refait, car elle doit par ajouter la distanceActuel si il y a un skip, opération impossible a faire dans la boucle
                if (!(LigneToSkip == LigneActuel)) {DistanceActuel += 1;}
                LigneActuel += 1 ;
                System.out.println();
                // permet de regarder si en doit faire l'Affiche en partant de la droite
                if (DistanceActuel == MAX_DISTANCE + 1) {ModeDescendant = false; DistanceActuel = MAX_DISTANCE - 1;}
            }
            // Meme logique que en haut, sauf que les signe vont depuis la droite vers la gauche en startant par la distance maximal - 1 pour faire une effet de triangle
            else {
                for (int RepetitionDeLinstructionSensOpposer = 0 ; RepetitionDeLinstructionSensOpposer < DistanceActuel ; RepetitionDeLinstructionSensOpposer ++ ) {
                    if (!(LigneToSkip == LigneActuel)) {System.out.print(SIGNE);}
                }
                if (!(LigneToSkip == LigneActuel)) {DistanceActuel -= 1;}
                LigneActuel += 1 ;
                System.out.println();
                if (DistanceActuel == 1) {ModeDescendant = true;}
            }
        } while (LigneActuel <= MAX_LIGNE) ;
        System.out.println();
        // Block 2 Jean Baptiste Dave
        //Initialisation de la variable largeur puisqu'on souhaite afficher 9 fois le chiffre 1 sur une ligne 
        final int largeur = 8; 
        /*Boucle for avec la variable i incrémenté à 0,la variable i montera
        de 1 tant  qu'elle ne sera pas plus grande que la variable largeur elle
        devra boucler ce qui se suit*/

        for (int i = 0; i <= largeur; i = i + 1) { 
        /* Initialisation de la variable j à 0,tant qu'elle  n'aura pas la même 
        valeur que  la variable i elle devra incrémentation par bon de 1 afin 
        d'obtenir la partie du schéma croissante*/
            for (int j = 0; j < i; j = j + 1) { 
            // Affichage d'un chiffre 1 pour chaque boucle sur une ligne(ex L1:1-11-111-1111)
            System.out.print ("1"); 
            } 
        /*A chaque fois que le système terminera une boucle il devra sauter de ligne pour
        réaliser celle qu suit*/
        System.out.println (); 
        } 
        /*Boucle for incluant une assignation de la variable i à la même valeur que celle de la 
        largeur pour réaliser la partie décroissante du schéma,tant que la variable ne soit pas 
        égale à 0 elle fera une décrémentation de 1*/
        for (int i = largeur; i >= 0; i = i - 1) { 
        /* Initialisation de variable j à 0,incrémentation par bon de 1 tant qu'elle 
        ne sera pas équivalente ou inférieur  à la variable i devenu */
            for (int j = 0; j <= i; j = j + 1) { 
            //Affichage du 1 sur une ligne en réalisant chaque boucle (ex 1-11-111-1111 etc) 
            System.out.print ("1"); 
            } 
        //Chaque fois qu'une boucle sera conclu le système continura l'opération sur une autre ligne
        System.out.println (); 
        } 
    }
}