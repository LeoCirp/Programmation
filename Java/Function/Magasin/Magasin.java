package Function.Magasin;

public class Magasin {
    private int stock;      // atribue
    // public en tous dans main et classe et package
    // private, juste dans la classe
    // rien, jsute dans classe et package

    // this retourne a l'attribue

    private String name;    // atribue 2
    public Magasin (String NameOfMagasin){  // construire les objets, classe est une gabarie, les objets
        this.name = NameOfMagasin;
        this.stock = 0;
    }
    public int GetStock() {
        return this.stock ;
    }

    // ! Méthode Accesseurs
    /*
     * permet d'accedez a la valeur d'une variable
     * elle est privé OBLIGATOIREMENT
     */
    // ! Méthode Mutateurs
    /*
     * Modifier une variable qui est privé
     */
    // ! Méthode ToStrung
    /*
     * Permet de voir le contenu d'un objet
     */
    // ! Méthode Équal
    /*
     * Permet de faire une comparaison boolean
     */

    public int AddStock (int amount) {
        if (amount > 0) {
            // ? Affichage ne marche pas, mais la condition oui
            return this.stock;
        }
        else {
        this.stock += amount ;
        return this.stock ;
        }
    }
    public int RemoveStock (int amount) {
        if (amount < 0) {
            // ? Affichage ne marche pas, mais la condition oui
            System.out.println("Veuillez saisire un nombre positif");
            return this.stock;
        }
        else {
            this.stock -= amount ;
            return this.stock ;
        }
    }
    public int Diffrence(Magasin second){
        if (second.stock > this.stock) {
            if (this.stock < 0) {
                return second.stock + this.stock ;
            }
            return second.stock - this.stock ;
        } else {
            if (second.stock < 0) {
                return this.stock + second.stock ;
            }
            return this.stock - second.stock ;
        }
    }
    public String GetName() {
        return this.name ;
    }
}
