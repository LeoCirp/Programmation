package Function.Banque;
import java.util.Scanner;
public class partieA {
    public static void main(String[] args) {
        Scanner Effectuer_un_premier_retrait = new Scanner(System.in) ;
        Effectuer_un_premier_retrait.close() ;
            float Valeur_rechercher ;
            boolean prochain_retrait = true ;
            compteBancaire Compte = new compteBancaire("martin", 1, 10.5f) ;
            System.out.println("Désirez vous faire un retrait? [true/false]") ;
            if (Effectuer_un_premier_retrait.nextBoolean()) {
                while (prochain_retrait) {
                   try (Scanner valeur_saisie = new Scanner(System.in)) {
                    try (Scanner Effectuer_un_retrait = new Scanner(System.in)) {
                        System.out.println("Veuillez saisire le montant a retirer...") ;
                        Valeur_rechercher = valeur_saisie.nextFloat() ;
                        if (Compte.getSolde() >= Valeur_rechercher && Valeur_rechercher > 0) {
                            Compte.retirer(Valeur_rechercher) ;
                            System.out.println("Montant retirer : " + Valeur_rechercher + "$") ;
                            System.out.println("Nouveau montant : " + Compte.getSolde() + "$") ;
                        } else {
                            System.out.println("Malheureusement, vous n'avez pas assez de fonds ou l'opération est impossible.\nDésirez vous refaire un essai avec un autre montant? [true/false]") ;
                            if (Effectuer_un_retrait.nextBoolean()) { continue ;} else { break ;}
                        }
                        System.out.println("Voulez vous faire un autre retrait ? [true/false]") ;
                        prochain_retrait = Effectuer_un_retrait.nextBoolean() ;
                    }
                }
                        
                    
                }
            }
            System.out.println("Vous avis mis fin au programme de transfert!");
            System.out.println("Nouveau montant : " + Compte.getSolde() + "$") ;
    }
}