package OrienterObjet.Evaluation1;

public class programme {
    public static void main(String[] args) {
        EmployePermanent employe = new EmployePermanent(123, "Jean", 10.0f, 0.2f, 50.0f, 0.1f);
        employe.affichage();
        System.out.println("Paie pour 37 heures : " + employe.paieHebdomadaire(37));
    }
}
