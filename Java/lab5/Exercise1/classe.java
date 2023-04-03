package lab5.Exercise1;

public class classe {
    // #
    //? Peremt de spécifier la portance et le type
    private int code;
    // #Constructeur
    //? Permet d'initialiser un objet
    public classe (int code) {
        this.code = code;
    }
    // #
    //? Permet d'affecter une valeur a l'objet
    public int GetCode () {
        return this.code;
    }
    // #
    //? Permet la gestion d'opération sur l'objet
    public void SetCode (int newCode) {
        this.code = newCode;
    }
}
