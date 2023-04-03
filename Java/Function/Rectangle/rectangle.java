package Function.Rectangle;

public class rectangle
{
    private float longueur;
    private float largeur;
 
    public rectangle(float longueur, float largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }    

    //Accesseurs
    public float getLargeur(){
        return largeur;
    }
    public float getLongueur(){
        return longueur;
    }
    
    //Mutateurs
    public void setLargeur(float largeur){
        this.largeur = largeur;
    }
    public void setLongueur(float longueur){
        this.longueur = longueur;
    }
    

    // autres méthodes
    public float perimetre(){
         return (longueur + largeur) * 2;
    }
    public float surface(){
        return longueur * largeur;
    }
    
    public String toString(){
        return "rectangle "+ longueur + " par " + largeur;
    }
    
    public boolean equals(rectangle p){
        return longueur == p.longueur & largeur == p.largeur;
    }
}