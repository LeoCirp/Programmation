package lab4;
import java.util.Scanner ;
public class Exercise3 {
    public static float CalculIMC (float Taille, float Poid) {
        return Poid / (Taille * Taille) ;
    }
    public static String ComparateurIMC(float Result) {
        String signification ;
        String RisqueDeMaladie ;
        if (Result < 18.5) {
            signification = "Poids insuffisant" ;
            RisqueDeMaladie = "Accru" ;
        } else if (Result < 25) {
            signification = "Poids santé" ;
            RisqueDeMaladie = "Moindre" ;
        } else if (Result < 30) {
            signification = "Léger excès de poids" ;
            RisqueDeMaladie = "Accru" ;
        } else if (Result < 35) {
            signification = "Obésité classe 1" ;
            RisqueDeMaladie = "Élevé" ;
        } else if (Result < 40) {
            signification = "Obésité classe 2" ;
            RisqueDeMaladie = "Très élevé" ;
        } else {
            signification = "Obésité classe 3" ;
            RisqueDeMaladie = "Extremement élevé" ;
        }
        System.out.println("Signification : " + signification) ;
        System.out.println("Risque de maladie : " + RisqueDeMaladie) ;
        return signification + RisqueDeMaladie ;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Veuillez saisire votre taille (Mètre)") ;
        float Taille = sc.nextFloat() ;
        System.out.println("Veuillez saisire votre taille (Kg)") ;
        float Poid = sc.nextFloat() ;
        float IMC_Enregistrer = CalculIMC(Taille,Poid) ;
        ComparateurIMC(IMC_Enregistrer) ;
        sc.close();
    }
}
