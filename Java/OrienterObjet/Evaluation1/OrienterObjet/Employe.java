package OrienterObjet;
public class Employe {
    private int numero;
    private String nom;
    public float tauxHoraire ;
    public Employe(int numero, String nom, float tauxHoraire) {
        this.numero = numero ;
        this.nom = nom ;
    }
    
    public void affichage() {
        System.out.println("Numero : " + numero + ", Nom : " + nom);
    }
    
    public int absences(int heuresTravaillees) {
        int heuresAbsences = 35 - heuresTravaillees;
        if (heuresAbsences < 0) {
            heuresAbsences = 0;
        }
        return heuresAbsences;
    }
    
    public int heuresSupplementaires(int heuresTravaillees) {
        int heuresSupp = heuresTravaillees - 35;
        if (heuresSupp < 0) {
            heuresSupp = 0;
        }
        return heuresSupp;
    }
}
