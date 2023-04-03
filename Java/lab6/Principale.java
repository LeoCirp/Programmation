package lab6;
/*
 * Cirpaci, Léo
 * 1 Avril 2023
 * Fichier d'éxécution
 */
public class Principale {
    public static void main(String[] args) {
        permanent E1 = new permanent(123, "Bert", 15.5f, 0.12f, 4.5f, 0.5f) ;
        E1.Affichage() ;
        System.out.println("Le paiment total pour " + E1.nom + " est de : " + E1.paieHebdo(37) + "$") ;

        consultant C1 = new consultant(456, "Romeo", 25.5f) ;
        C1.Affichage() ;
        System.out.println("Le salaire total pour " + C1.nom + " est de : " +  C1.salaireHebdo(37) + "$\n") ;
        if (C1.validationFactureHebdo(943.5f, 37)) {
            System.out.println("Le montant est égal au salaire") ;
        } else {
            System.out.println("Le montant n'est pas égal au salaire") ;
        }
    }
}
