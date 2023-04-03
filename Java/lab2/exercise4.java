package lab2;

public class exercise4 {
    public static void main(String[] args) {
        int Addition = 0 ;
        for (int i = 0 ; i < 1000 ; i+=2) {
            Addition += i ;
        }
        System.out.println("La Somme paires entre 1 et 1000 est " + Addition);
    }
}