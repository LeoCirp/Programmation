package Function.Etudiant;
import java.util.ArrayList;
public class programme {
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant("AA0001", "Bertrand", new ArrayList<Float>()) ;
        etudiant.ajouter(60.55f) ;
        etudiant.ajouter(40.95f) ;
        System.out.println(etudiant.toString()) ;
        etudiant.bonusPenalite(50, true) ;
        System.out.println(etudiant.toString()) ;
        cours francais = new cours("FR101", "Francais 1") ;
        cours Mathematique = new cours("MTH101", "Mathématique 1") ;
        etudiant.setCours(francais);
        etudiant.setCours(Mathematique);
        System.out.println(etudiant.toString());
    }
}
