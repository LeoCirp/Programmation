package lab3 ;
public class Exercise1_solv {
    public static void main(String[] args) {
        int [] T1 = {1,2,0,-1,-2} ;
        int T2[] ;
        int T3[] ;
        T2 = new int [5] ;
        T3 = new int [5] ;
    
        int countPositive = 0;
        int countNegative = 0;
    
        for (int element : T1) {
            if (element >= 0) {
                T2[countPositive] = element ;
                countPositive++;
            } else {
                T3[countNegative] = element ;
                countNegative++;
            }
        }
        System.out.println("Positive values:");
        for (int i = 0; i < countPositive; i++) {
            System.out.println(T2[i]);
        }
        System.out.println("Negative values:");
        for (int i = 0; i < countNegative; i++) {
            System.out.println(T3[i]);
        }
    }
    
}