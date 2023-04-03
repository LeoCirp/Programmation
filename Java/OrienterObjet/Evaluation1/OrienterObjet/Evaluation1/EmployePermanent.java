package OrienterObjet.Evaluation1;

import OrienterObjet.Employe;

public class EmployePermanent extends Employe {
    private float tauxRetenusImpots;
    private float cotisationAssurance;
    private float tauxCotisationRetraite;
    
    public EmployePermanent(int numero, String nom, float tauxHoraire, float tauxRetenusImpots, 
                            float cotisationAssurance, float tauxCotisationRetraite) {
        super(numero, nom, tauxHoraire);
        this.tauxRetenusImpots = tauxRetenusImpots;
        this.cotisationAssurance = cotisationAssurance;
        this.tauxCotisationRetraite = tauxCotisationRetraite;
    }
    
    public float salaireHebdomadaire(int heuresTravaillees) {
        int heuresRegulieres = heuresTravaillees - heuresSupplementaires(heuresTravaillees);
        float salaireRegulier = heuresRegulieres * tauxHoraire;
        float salaireSupplementaire = heuresSupplementaires(heuresTravaillees) * tauxHoraire * 1.5f;
        return salaireRegulier + salaireSupplementaire;
    }
    
    public float paieHebdomadaire(int heuresTravaillees) {
        float salaireHebdo = salaireHebdomadaire(heuresTravaillees);
        float retenusImpots = tauxRetenusImpots * salaireHebdo;
        float cotisationRetraite = tauxCotisationRetraite * salaireHebdo;
        return salaireHebdo - retenusImpots - cotisationAssurance - cotisationRetraite;
    }
}
