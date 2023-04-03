package lab6;
/*
 * Cirpaci, Léo
 * 1 Avril 2023
 * Classe Employé consultant, basé sur la classe employé
 */
public class consultant extends employe {

    consultant(int numero, String nom, float tauxHoraire) {
        super(numero, nom, tauxHoraire);
    }
    public int absences(int heure) {
        if( 40 - heure > 0) { return 40 - heure ; }
        return 0 ;
    }
    public int supplementaires(int heure) {
        if ( heure - 40 > 0 ) { return heure - 40 ; }
        return 0 ;
    }
    public boolean validationFactureHebdo(float montant, int heure) {
        if (montant == salaireHebdo(heure)) { return true ; }
        return false ;
    }
    
}
