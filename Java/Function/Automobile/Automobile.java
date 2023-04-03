package Function.Automobile;

public class Automobile {
    private String marque ;
    private String modele ;
    private String couleur ;
    private int annee ;
    private float prix ;

    public Automobile (String marque, String modele, String couleur, int annee, float prix) {
        this.marque = marque ;
        this.modele = modele ;
        this.couleur = couleur ;
        this.annee = annee ;
        this.prix = prix;
    }

    public String getMarque() {
        return this.marque ;
    }
    public String getModele() {
        return this.modele ;
    }
    public String getCouleur() {
        return this.couleur ;
    }
    public int getAnnee() {
        return this.annee ;
    }
    public float getPrix() {
        return this.prix ;
    }
    public void steCouleur(String couleur) {
        this.couleur = couleur ;
    }
    public void diminierPrixPourcent(float pourcent) {
        this.prix = this.prix - (this.prix * pourcent ); // (this.prix * pourcent * 100) n'est possible seulement si l'argumnet serait entier (10)
    }
    public void augmenterPrixPourcent(float pourcent) {
        this.prix = this.prix + (this.prix * pourcent ); // (this.prix * pourcent * 100) n'est possible seulement si l'argumnet serait entier (10)
    }
    public void diminierPrixAbsolue(float valeur) {
        this.prix -= valeur ;
    }
    public void augmenterPrixAbsolue(float valeur) {
        this.prix += valeur ;
    }
    public String ToString() {
        return "Marque : " + this.marque + ", Modèle : " + this.modele + ", Couleur : " + this.couleur + ", Année : " + this.annee + ", Prix : " + this.prix + "$" ;
    }
}
