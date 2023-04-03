package lab2;

import java.util.Scanner;

public class exercise3d {
    public static void main(String[] args) {

        final int MAX_ETUDIANT = 3 ;
        final int MAX_EVALUATION = 2 ;

        int IndicationEtudiant = 0 ;
        float NoteEtudiant = 0 ;
        float MoyenneGlobal = 0 ;

        for ( int i = 0 ; i < MAX_ETUDIANT ; i++ ) {
            NoteEtudiant = 0 ;
            IndicationEtudiant += 1 ;
            for ( int j = 0 ; j < MAX_EVALUATION ; j++ ) {
                System.out.println("Veuillez faire une saisie de note en lien avec l'étuidant : " + IndicationEtudiant + " (" + j + "/" + MAX_EVALUATION + ")");
                try (Scanner Note = new Scanner(System.in)) {
                    NoteEtudiant += Note.nextFloat() ;
                }
            }
            float MoyenneEtudiant = NoteEtudiant / MAX_EVALUATION ;
            MoyenneGlobal += MoyenneEtudiant ;
            System.out.println("Moyenne de l'Étudiant " + IndicationEtudiant + " est " + MoyenneEtudiant);
        }
        if (IndicationEtudiant == MAX_ETUDIANT) {
            MoyenneGlobal = MoyenneGlobal / MAX_ETUDIANT ;
            System.out.println("Moyenne du groupe est " + MoyenneGlobal);
        }

    }
}
