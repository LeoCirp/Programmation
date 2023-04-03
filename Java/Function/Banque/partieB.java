package Function.Banque;
import java.util.Scanner;
public class partieB {
    public static void main(String[] args) {
        try (Scanner Effectuer_un_premier_transfert = new Scanner(System.in)) {
            float Valeur_rechercher ;
            boolean prochain_transfert = true ;
            compteBancaire Paul = new compteBancaire("Paul", 1234, 0.00f) ;
            compteBancaire Rita = new compteBancaire("Rita", 2345, 2020.00f) ;
            System.out.println("Désirez vous faire un transfert du compte de Rita vers Paul? [true/false]") ;
            if (Effectuer_un_premier_transfert.nextBoolean()) {
                while (prochain_transfert) {
                    try (Scanner valeur_saisie = new Scanner(System.in)) {
                        try (Scanner Effectuer_un_transfert = new Scanner(System.in)) {
                            System.out.println("[===== Montant disponible =====]") ;
                            System.out.println(Paul.getNomClient() + "[#" + Paul.getNoCompte() + "]\t" + Paul.getSolde() + "$") ;
                            System.out.println(Rita.getNomClient() + "[#" + Rita.getNoCompte() + "]\t" + Rita.getSolde() + "$") ;
                            System.out.println("Veuillez saisire le montant a retirer...") ;
                            Valeur_rechercher = valeur_saisie.nextFloat() ;
                            if (Rita.getSolde() > 0 && Valeur_rechercher > 0) {
                                Rita.transfert(Paul, Valeur_rechercher) ;
                                System.out.println("[===== Transfert des valeurs =====]") ;
                                System.out.println(Paul.getNomClient() + "[#" + Paul.getNoCompte() + "]\t" + Paul.getSolde() + "$") ;
                                System.out.println(Rita.getNomClient() + "[#" + Rita.getNoCompte() + "]\t" + Rita.getSolde() + "$") ;
                            } else {
                                System.out.println("Malheureusement, Rita n'a pas assez de fonds pour se transfert ou l'opération est impossible.\nDésirez vous refaire un essai avec un autre montant? [true/false]") ;
                                if (Effectuer_un_transfert.nextBoolean()) { continue ;} else { break ;}
                            }
                            System.out.println("Voulez vous faire un autre transfert vers Paul ? [true/false]") ;
                            prochain_transfert = Effectuer_un_transfert.nextBoolean() ;
                        }
                    }
                }
            }
            System.out.println("Vous avis mis fin au programme de transfert!");
            System.out.println("[===== Sommaire =====]") ;
            System.out.println(Paul.getNomClient() + "[#" + Paul.getNoCompte() + "]\t" + Paul.getSolde() + "$") ;
            System.out.println(Rita.getNomClient() + "[#" + Rita.getNoCompte() + "]\t" + Rita.getSolde() + "$") ;
        }
    }
}