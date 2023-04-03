package Function.Rectangle;

public class runer
{
	public static void main(String[] args) {
	    //création d'objet rectangle
	    rectangle r1 = new rectangle(4.5f, 3.0f);
	    
	    //affichage
	    System.out.println("r1 :" + r1);
	    //utilisation des autres méthodes de rectangle
	    System.out.println("périmètre : "+r1.perimetre());
	    System.out.println("surface : " + r1.surface());
	    
	    rectangle r2 = new rectangle(4.5f, 2.0f);
	    System.out.println("r2 :" + r2);
        rectangle r3 = new rectangle(4.5f, 3.0f);
        System.out.println("r3 :" + r3);
        
        //comparaison d'objets rectangles
        System.out.println("r1 et r2 sont égaux : "+ r1.equals(r2));
        System.out.println("r1 et r3 sont égaux : "+ r1.equals(r3));
        
        rectangle r4 = new rectangle(4.5f, 3.0f);
        
        //utilisation de mutateur
        r4.setLongueur(10.0f);
        System.out.println("r4 :" + r4);
	}
}
