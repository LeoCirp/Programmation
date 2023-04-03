package lab2;

public class exercise5 {
    public static void main(String[] args) {
              final int MAX_LIGNE = 4;
              final char Signe = '@';
              for (int i = 1; i <= MAX_LIGNE; i++) {
                for (int j = 1; j <= i; j++) {
                  System.out.print(Signe);
                }
                System.out.println();
              }
              for (int i = MAX_LIGNE - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                  System.out.print(Signe);
                }
                System.out.println();
              }  
    }
}