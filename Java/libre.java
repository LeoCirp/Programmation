public class libre {
    public static void main(String[] args) {
        String str = "Hey mon ami";
        System.out.println(str.toUpperCase());
        char st = 'a';
        // # Méthode statique
        // ? Appliquer au niveau de la classe, pas de l'objet
        // ? nom_de_la_classe.methode(parametre)
        // ? Est globale appliquer (exemple formule de math)
        // ? math.sin, string.
        // # Méthode dynamique
        // ? Applique dans un cas unique
        // ? exemple une variable
        // ? compare to
        if (Character.isUpperCase(st)) {
            System.out.println(Character.toLowerCase(st));

        } else {
            System.out.println(Character.toUpperCase(st));
        }
    }
}