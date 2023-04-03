package lab4;
import java.util.Scanner ;
public class Exercise2 {
    public static float CalculIMC (float Taille, float Poid) {
        return Poid / Taille ;
    }
    public static String ComparateurIMC(float Result) {
        String message ;
        if (Result < 18.5) {
            message = "Poids insuffisant";
        } else if (Result < 25) {
            message = "Poids santé";
        } else if (Result < 30) {
            message = "Léger excès de poids";
        } else if (Result < 35) {
            message = "Obésité classe 1";
        } else if (Result < 40) {
            message = "Obésité classe 2";
        } else {
            message = "Obésité classe 3";
        }
        System.out.print(message);
        return message;
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
