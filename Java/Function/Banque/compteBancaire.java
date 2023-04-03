package Function.Banque;


public class compteBancaire {
    // @ Attributs objet
    private int noCompte ;
    private String nomClient ;
    private float solde ;
    private int nbOperations = 0 ;  // aucune saisie a faire a se niveau
    // @ Attributs satique
    // ? Applicable a tous le monde
    private static float tauxInteret = 0.1f ;
    private static float fraisExtra = 0.05f ;
    //@ Constructeur
    public compteBancaire(String client, int numero, float solde) {
        this.nomClient = client ;    //nomClient = client
        this.noCompte = numero ;     //noCompte = numero
        this.solde = solde ;
    }
    //@ Acceseurs
    public float getSolde() {
        return this.solde ;
    }
    public String getNomClient() {
        return this.nomClient ;
    }
    public int getNoCompte() {
        return this.noCompte ;
    }
    //@
    public void deposer(float montant) {
        this.solde += montant ;
        nbOperations ++ ;
    }
    public void retirer(float montant) {
        this.solde -= montant ;
    }
    public void transfert(compteBancaire objet, float montant) {
        if (this.solde - montant < 0) { return ; }    //facultatif
        this.retirer(montant);  //this.solde -= montant ;
        objet.deposer(montant);  //objet.solde += montant ;
        //nbOperations ++ ; vu que ces appliquer
    }
    public float calculerInteret() {
        return tauxInteret * this.solde / 100 ;
    }
    public float calculerFrais() {
        float frais = 0 ;
        for (int i = 0 ; i < nbOperations ; i++) {
            if (i <= 5) { continue ; }
            frais += fraisExtra ;
        }
        return frais ;
        /*
         * if (nbOperations <= 5) {
         *  return 0f;
         * } else {
         *  return fraisExtra * (nbOperations - 5)}
         */
    }
    public void finirMois() {
        this.solde -= calculerFrais() ;
        this.solde += calculerInteret() ;
        nbOperations = 0 ;
    }
}
