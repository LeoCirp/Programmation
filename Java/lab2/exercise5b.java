package lab2;

public class exercise5b {
    public static void main(String[] args) {

        final int MAX_DISTANCE = 3 ;
        final int MAX_LIGNE = 7 ;
        final char Sym = '$' ;
    //    int LigneActuel = 1 ;
        int DistanceActuel = 1 ;
        boolean reverse = true ;
        for (int i = 0 ; i < MAX_LIGNE ; i++) {
            if (reverse) {
                for (int j = 0 ; j < DistanceActuel ; j++) {
                    System.out.print(Sym);
                }
                DistanceActuel += 1 ;
            }
            if (reverse == false) {
                for (int j = DistanceActuel ; j < 0 - 1 ; j--) {
                    System.out.print(Sym);
                }
            }
            System.out.println("");
    //        LigneActuel += 1 ;
            if (DistanceActuel == MAX_DISTANCE + 1) {
                reverse = false ;
                DistanceActuel -= DistanceActuel ;
            }
            if (DistanceActuel == 0) {
                reverse = true ;
                DistanceActuel = 1 ;
            }
        }
    }
}
