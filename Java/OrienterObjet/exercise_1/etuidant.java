package OrienterObjet.exercise_1 ;
class etudiant {
    protected String nom ;
    protected int age ;
// # protected, accesible uniquement au deriver de la classe
// # private, accesible uniquement dans la classe
// # public, ouvert partout

    // # Constructeur
    etudiant(String nom, int age) {
        this.nom = nom ;
        this.age = age ;
    }
    // # Constrcuteur par défault
    etudiant() {

    }
    // # Getters
    public String GetNom() {
        return this.nom ;
    }
    public int GetAge() {
        return this.age ;
    }
    public String ToString() {
        return "Nom : " + this.nom + " Age : " + this.age ;
    }
    // # Setters
    public void SetNom(String name) {
        this.nom = name ;
    }
    public void SetAge(int age) {
        this.age = age ;
    }
}