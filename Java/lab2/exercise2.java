package lab2;
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        float Calcul = 0;
        int controlNombre = 0;
        float Note = 0;
        boolean execution = true;
        while (execution) {
            Calcul = Calcul + Note;
            controlNombre = controlNombre + 1 ;
            try (Scanner saisie = new Scanner(System.in)) {
                Note = saisie.nextFloat();
            }
            if ( Note == 0 ) {
                execution = false;
            }
        }
        System.out.println("Il y a eu : " + controlNombre + " Saisie Valide");
        System.out.println("La moyenne est de : " + Calcul / controlNombre);
    }
}
