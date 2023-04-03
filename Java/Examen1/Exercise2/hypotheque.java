package Examen1.Exercise2 ;
/*
 * Cirpaci, Léo
 * Exercise 2a : Examen 1 : class hypoteque
 * 17 mars 2023
 */
import java.time.LocalDate ;
import java.time.Clock ;

public class hypotheque {

    private String compte ;
    private float montantInitial ;
    private float tauxMensuel ;
    private int duree ;
    private float mensualite ;
    private float supplementMensualite ;
    private LocalDate dateMensualite ;
    private LocalDate dateRemboursement ;
    private float solde ;
    private float interet ;

    public hypotheque(String compte, float montantInitial, float tauxMensuel, int duree, float mensualite) {
        this.compte = compte ;
        this.montantInitial = montantInitial ;
        this.tauxMensuel = tauxMensuel ;
        this.duree = duree ;
        this.mensualite = mensualite ;
        this.solde = this.montantInitial ;
        this.dateRemboursement = LocalDate.of(1900, 1, 1); ;
    }
    public String ToString() {
        return "Compte : " + this.compte + " solde : " + this.solde + " interet : " + this.interet + " mensualite : " + this.mensualite + " Supplement Mensualite : " + this.supplementMensualite + " Date Mensualite : " + this.dateMensualite + " Date Remboursement : " + this.dateRemboursement;
    }
    public float payerMensualite() {
        float InteretMensualite = this.solde * (this.tauxMensuel / 100) ;
        this.interet += InteretMensualite ;
        float CapitalMensualite = this.mensualite - InteretMensualite ;
        this.solde -= supplementMensualite + CapitalMensualite ;
        this.dateMensualite = LocalDate.now(Clock.systemDefaultZone());
        return this.solde ;
    }
    public int augmenterMensualite(float montant) {
        if (this.supplementMensualite > this.mensualite) {
            return -1 ;
        } else {
            this.supplementMensualite += montant ;
            return 0 ;
        }
    }
    public int payerRemboursement(float montant) {
        LocalDate dateLimite = LocalDate.now(Clock.systemDefaultZone()).plusYears(1);
        if (montant > this.montantInitial * 0.10 || this.dateMensualite.isBefore(dateLimite)) {
            return -1;
        } else {
            this.solde -= montant;
            this.dateRemboursement = LocalDate.now(Clock.systemDefaultZone());
            return 0;
        }
    }
    public float getMontantInitital() {
        return this.montantInitial ;
    }
    public float getTauxMensuel() {
        return this.tauxMensuel ;
    }
    public int getDuree() {
        return this.duree ;
    }
    public float getMensualite() {
        return this.mensualite ;
    }
    public float getSupplementMensualite() {
        return this.supplementMensualite ;
    }
    public LocalDate getDateMensualite() {
        return this.dateMensualite ;
    }
    public LocalDate getDateRemboursement() {
        return this.dateRemboursement ;
    }
    public float getSolde() {
        return this.solde ;
    }
    public float getInteret() {
        return this.interet ;
    }
} 
