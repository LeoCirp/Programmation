package lab6;
/*
 * Cirpaci, Léo
 * 1 Avril 2023
 * Classe Employé permanenet, basé sur la classe employé
 */
public class permanent extends employe {
    private float TauxRetenueImpot ;
    private float CotisationAssurance ;
    private float TauxCotisationRetraite ;
    permanent(int numero, String nom, float tauxHoraire, float TauxRetenueImpot, float CotisationAssurance, float TauxCotisationRetraite) {
        super(numero, nom, tauxHoraire) ;
        this.TauxRetenueImpot = TauxRetenueImpot ;
        this.CotisationAssurance = CotisationAssurance ;
        this.TauxCotisationRetraite = TauxCotisationRetraite ;
    }
    public float salaireHebdo(int heure) {
        int HorsSuplementaire = heure - supplementaires(heure) ;
        float TotalHorsSuplementaire = HorsSuplementaire * this.tauxHoraire ;

        int EnDehorsSuplementaire = heure - HorsSuplementaire ;
        float TotalSuplementaire = EnDehorsSuplementaire * this.tauxHoraire * 1.5f;

        float total = TotalHorsSuplementaire + TotalSuplementaire ;
        return total ;
    }
    public float paieHebdo(int heure) {
        float RetenuImpot = salaireHebdo(heure) * TauxRetenueImpot ;
        float CotisationRetraite = salaireHebdo(heure) * TauxCotisationRetraite ;
        float total = salaireHebdo(heure) - (RetenuImpot + CotisationRetraite + CotisationAssurance) ;
        return total ;
    }
}
