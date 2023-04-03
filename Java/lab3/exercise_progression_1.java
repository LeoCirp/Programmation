package lab3 ;
import java.util.Scanner;
public class exercise_progression_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NbGrp;
        final int NbEtu;
        System.out.println("Groupes");
        NbGrp = sc.nextInt();
        System.out.println("Étudiants");
        NbEtu = sc.nextInt();
        float notes[][] = new float[NbGrp][NbEtu];
        float moyenne[] = new float[NbGrp];
        float somme = 0;

        for (int i = 0; i < NbGrp ; i++) {
            for (int j = 0 ; j <NbEtu ; j++) {
                System.out.println("Saisie pour Groupe : "+i+" notes : "+j+" / "+NbEtu);
                notes[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < NbGrp ; i++) {
            somme = 0;
            for (int j = 0 ; j <NbEtu ; j++) {
                somme += notes[i][j];
            }
            moyenne[i] = somme / NbEtu;
        }

        for (int i = 0 ; i < NbGrp ; i++ ) {
            System.out.println(moyenne[i]);
        }

        // extra
        sc.close();
    }
}