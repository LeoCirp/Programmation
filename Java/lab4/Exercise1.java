package lab4 ;
import java.util.Scanner ;
public class Exercise1 {
    public static float CalculIMC(float Taille, float Poid) {
        return Poid / Taille ;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Veuillez saisire votre taille (Mètre)") ;
        float Taille = sc.nextFloat() ;
        System.out.println("Veuillez saisire votre taille (Kg)") ;
        float Poid = sc.nextFloat() ;
        float IMC = CalculIMC(Taille,Poid) ;
        System.out.print(IMC) ;
        sc.close();
    }
}
