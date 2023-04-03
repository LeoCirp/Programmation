package lab3 ;
public class exerciseTab {
    public static void main(String[]args) {
        int A[];
        A = new int [4];
        A[1] = 55 ;
        A[2] = 4;
        A[3] = 7;
        A[0] = 4;
        int cal = 0 ;
        for (int i : A) {
            cal += i;
        }
        System.out.println(cal);


        String R[];
        R = new String [1];
        R[0] = "Hello World";
        System.out.println(R[0]);

        for (int i = 0 ; i < 1 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                System.out.println(R[i]);
                System.out.println(A[j]);
            }
        }


    }
}
