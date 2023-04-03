package Function.Magasin;

public class run {
    public static void main(String[] args) {
        Magasin Shop1 = new Magasin("Martin") ;
        Magasin Shop2 = new Magasin("Michelle") ;
        Shop1.AddStock(55) ;
        Shop2.AddStock(9) ;
        System.out.println(Shop1.GetStock() + " Contenu du magasin 1") ;
        System.out.println(Shop2.GetStock() + " Contenu du magasin 2") ;
        System.out.println(Shop1.Diffrence(Shop2) + " Différence entre les magasins | " + Shop1.GetStock() + " - " + Shop2.GetStock()) ;
    }
}