package Function.Automobile;

public class programme {
    public static void main(String[] args) {
        Automobile auto1 = new Automobile("Toyota", "Corolla", "bleue", 2015, 10000) ;
        System.out.println(auto1.ToString()) ;
        System.out.println(auto1.getMarque()) ;
        System.out.println(auto1.getModele()) ;
        System.out.println(auto1.getCouleur()) ;
        System.out.println(auto1.getAnnee()) ;
        System.out.println(auto1.getPrix()) ;
        auto1.augmenterPrixPourcent(.10f);
        System.out.println(auto1.getPrix()) ;
        auto1.diminierPrixAbsolue(2500);
        auto1.steCouleur("mauve");
        System.out.println(auto1.ToString()) ;
    }
}
