package lab3 ;
import java.util.Scanner;
public class exercise_progression_2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Saisire le nombre d'employé");
        final int NbEmploye = sc.nextInt() ;
        int salaire [] = new int [NbEmploye] ;
        for (int i = 0 ; i < NbEmploye ; i++) {
            System.out.println("Saisire un nouveau salaire");
            salaire[i] = sc.nextInt() ;
        }
        int salaireMin = salaire[0] ;
        int salaireMax = salaire[0] ;
        int salaireMoyen = 0 ;
        if (!(NbEmploye == 0)) {
            for (int value : salaire) {
                if (value < salaireMin) {
                    salaireMin = value ;
                }
                if (value > salaireMax) {
                    salaireMax = value ;
                }
                salaireMoyen += value ;
            }
        }
        salaireMoyen = salaireMoyen / NbEmploye ;
        System.out.println("Salaire Minimum "+salaireMin) ;
        System.out.println("Salaire Minimum "+salaireMax) ;
        System.out.println("Salaire Minimum "+salaireMoyen) ;
                // extra
                sc.close();
    } 
}
