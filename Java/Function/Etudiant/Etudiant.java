package Function.Etudiant;

import java.util.ArrayList;
class Etudiant{
    private String code;
    private String nom;
    private ArrayList<Float> notes = new ArrayList<Float>();
    private ArrayList<cours> cours = new ArrayList<cours>();
    //constructeur
    public Etudiant(String code, String nom, ArrayList<Float> notes){
        this.code = code;
        this.nom = nom;
        this.notes = notes;
    }    
    //getters (accesseurs)
    public String getCode(){
        return code;
    }
    public String getNom(){
        return nom;
    }
    public ArrayList<Float> getNotes(){
        return notes;
    }
    
    //setters (mutateurs)
    public void setCode(String code){
        this.code = code;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setNotes(ArrayList<Float> notes){
        this.notes = notes;
    }
    
    // autres méthodes
    public float moyenne(){
        float somme = 0f;
        for (int i=0; i<notes.size(); i++)
            somme += notes.get(i);
            
    /* utilisation d for each    
        for (float n : notes)
            somme += n;
    */
    
        if (notes.size() == 0)
            return 0;
        else
            return somme / notes.size();
    }
    public void ajouter(float note){
        notes.add(note);
    }
    public void supprimer(Float note){
        notes.remove(note);
    }
    public void supprimerTout(Float note){
        while (notes.remove(note));
    }
    public int rechercher(Float note){
        return notes.indexOf(note);
    }
    public ArrayList<Integer> rechercherTout(Float note){
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for (int i=0; i<notes.size(); i++)
            if (notes.get(i).equals(note))
                indices.add(i);
        return indices; 
    }
    public String toString(){
        return code + ", " + nom + ", " + notes + getCours();
    }

    public void bonusPenalite(float pourcentage, boolean bonus) {
        for (int i = 0; i < notes.size(); i++) {
            float note = notes.get(i);
            if (bonus) {
                note += note * pourcentage / 100;
            } else {
                note -= note * pourcentage / 100;
            }
            notes.set(i, note);
        }
    }
    
    public ArrayList<cours> getCours(){
        return cours;
    }
    public void setCours(cours nom_du_cours){
        cours.add(nom_du_cours);
    }
    
    
}
