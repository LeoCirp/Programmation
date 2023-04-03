package lab6;
/*
 * Cirpaci, Léo
 * 1 Avril 2023
 * Classe Employé (parent des autres classe)
 */
public class employe {
    protected int numero ;
    protected String nom ; 
    protected float tauxHoraire ;
    employe(int numero, String nom, float tauxHoraire) {
        this.numero = numero ;
        this.nom = nom ;
        this.tauxHoraire = tauxHoraire ;
    }
    public void Affichage() {
        System.out.println( "\nNuméro : " + this.numero + ", Nom : " + this.nom + "\n") ;
    }
    protected int absences(int heure) {
        if( 35 - heure > 0) { return 35 - heure ; }
        return 0 ;
    }
    protected int supplementaires(int heure) {
        if ( heure - 35 > 0 ) { return heure - 35 ; }
        return 0 ;
    }
    protected float salaireHebdo(int heure) {
        int HorsSuplementaire = heure - supplementaires(heure) ;
        float TotalHorsSuplementaire = HorsSuplementaire * this.tauxHoraire ;

        int EnDehorsSuplementaire = heure - HorsSuplementaire ;
        float TotalSuplementaire = EnDehorsSuplementaire * this.tauxHoraire * 1.5f;

        float total = TotalHorsSuplementaire + TotalSuplementaire ;
        return total ;
    }
}
