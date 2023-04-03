package lab2;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        final int NombreSaisie = 3;
        float Note;
        float TotalCumule = 0;
        for (int i = 0 ; i < NombreSaisie; i++) {
            System.out.println("Veuillez faire une saisie de note (" + i + "/" + NombreSaisie + ")");
            try (Scanner Saisie = new Scanner(System.in)) {
                Note = Saisie.nextInt();
            }
            TotalCumule = TotalCumule + Note;
        }
        float Calcul = TotalCumule / NombreSaisie ;
        System.out.println("Il y a eu " + NombreSaisie + " saisie de note");
        System.out.println("La moyenn est de : " + Calcul);
    }
}
