import java.util.Scanner ; // active la lib pour les saisies
public class Tutoriel {
    public static void main(String[] args) {
        char caractere = '#' ;
        String message ;
        int nombre ; // cette etape s'appelle l'initialisation
        float decimal = 1.1234567F ;// F est une convention
        double decimalExtra = 1.123456789101112 ; // permet exposant 2 de capacite de flaot
        boolean EstceVrai = true ;

        System.out.println("Cette commande me permet de print dans la console avec un saut de ligne") ;
        System.out.print("Cette instruction ne fair pas de saut de ligne automatique, nécessite \\n\n") ;
        System.out.println(caractere + decimal + decimalExtra) ;
        nombre = 123567891 ;// cette etape s'apelle l'assigantion

        if ( nombre <= 123456789) {
            System.out.println("La valeur est inférieur ou égale a 123456789") ;
            if ( nombre == 123456789 ) {
                System.out.println("La variable est bien égale a 123456789") ;
            }
            else {
                System.out.println("Inférieur a 123456789");
            }
        }
        else {
            System.out.println("La valeur est suppérieur") ;
            if ( EstceVrai ) {
                System.out.println("Le message est exacte!");
            }
        }
        System.out.println("Veuillez faire une saisie") ;
        Scanner Demande = new Scanner(System.in) ;
        message = Demande.next() ;
        System.out.println(message + " est votre saisie") ;
        Demande.close();
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("ok : " + i);
        }

        for (int y = 5 ; y > 0 ; y = y - 1) {   //y--
            System.out.println("yep : " + y);
        }
        String intern ;
        String caracteres ;
        caracteres = "#" ;
        while ( !caracteres.equals("ending") ) {
            System.out.println("saisire char pour changement") ;
            Scanner requet = new Scanner(System.in) ;
            intern = requet.next() ;
            requet.close();
            caracteres = intern ;
        }
        // ! Fonction faire -block tantque
        int ch = 0 ;
        do {
            System.out.println("Message Error") ;
            ch++ ; 
        } while ( ch < 5 );
        int saisiecustom ;
        do {
            System.out.println("saisire un nombre") ;
            Scanner SaisieCOnsole = new Scanner(System.in) ;
            saisiecustom = SaisieCOnsole.nextInt() ;
            SaisieCOnsole.close();
        } while ( saisiecustom >= 0 ) ;
        // ! Création des tableaux
        int Tab[];
        Tab = new int [6];
        Tab[5] = 90 ;
        int [] index = {1,2,3,4,5,6};
        for (int controle : index){
            System.out.println(controle);
        }
        for (int i = 0 ; i < 6 ; i++ ) {
            if (Tab[i] == 0) {
                Tab[i] = 5;
            }
            System.out.println("rendu"+i+" "+Tab[i]);
        }

        // ! Création de classe ( fonction )
        
/*
        # Fichier A ( Classe )
         @ public class class_c {
         *  private int Stock ;
         *  private String Nom ;
         *  private int amount ;

         ?  public class_c(String name_of_etablissement) {
         *      this.Nom = name_of_etablissement ;
         *      this.Stock = 0 ;
         *  }
         
         ?  public int GetStock() {
         *      return this.Stock ;
         *  }
         
         ? public int AddStock(int amount){
         *      this.Stock += amount ;
         *      return this.Stock ;
         @  }

         *}
        # Fichier A ( Classe )
        @        public static void main(String[] args) {
        *            class_c Shop1 = new class_c("Martin");
        !            class_c Shop2 = new class_c("Michelle");
        *            class_c Shop3 = new class_c("Mathieux");
        *            Shop1.AddStock(5);
        #            Shop2.AddStock(4);
        *            Shop3.AddStock(7);
        *            System.out.println(Shop1.GetStock());
        ?            System.out.println(Shop2.GetStock());
        *            System.out.println(Shop3.GetStock());
        @        }
*/


    }
}