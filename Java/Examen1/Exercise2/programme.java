package Examen1.Exercise2;
/*
 * Cirpaci, Léo
 * Exercise 2b : Examen 1 : package hypoteque
 * 17 mars 2023
 */

public class programme {
    public static void main(String[] args) {
        hypotheque hypotheque1 = new hypotheque("HYP2023001", 80000, 0.494f, 120, 885.21f) ;
        System.out.println(hypotheque1.ToString()) ;
        hypotheque1.payerMensualite();
        System.out.println(hypotheque1.ToString()) ;
        hypotheque1.augmenterMensualite(114.79f) ;
        System.out.println(hypotheque1.ToString()) ;
        hypotheque1.payerRemboursement(8000) ;
        System.out.println(hypotheque1.ToString()) ;
        hypotheque1.payerRemboursement(8000) ;
        System.out.println(hypotheque1.ToString()) ;
    }
}
