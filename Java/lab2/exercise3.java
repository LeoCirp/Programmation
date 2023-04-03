package lab2;
import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
              final int NombreEtudiant = 2;
              final int NombreNote = 3;

              float NoteTotal = 0;
              float[] NoteEtudiant = new float[NombreEtudiant]; //permet l'utilisation d'un tableau

              for (int i = 0; i < NombreEtudiant; i++) {
                float NoteTotalEtudiant = 0;
                System.out.println("Entrez les notes pour l'élève " + (i + 1));
                for (int j = 0; j < NombreNote; j++) {
                  System.out.print("Entrez la note " + (j + 1) + " : ");
                  float Note = scanner.nextFloat();
                  NoteTotalEtudiant += Note;
                  NoteTotal += Note;
                }
                NoteEtudiant[i] = NoteTotalEtudiant / NombreNote;
                System.out.println("La moyenne de l'élève " + (i + 1) + " est " + NoteEtudiant[i]);
              }
              float Moyenne = NoteTotal / (NombreEtudiant * NombreNote);
              System.out.println("La moyenne de la classe est " + Moyenne);
            }
    }
}
