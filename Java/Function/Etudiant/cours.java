package Function.Etudiant;

public class cours {
    private String code ;
    private String titre ;

    public cours (String code, String titre) {
        this.code = code ;
        this.titre = titre ;
    }
    public String getCode() {
        return this.code ;
    }
    public String getTitre() {
        return this.titre ;
    }
    public void setCode(String code) {
        this.code = code ;
    }
    public void setTitre(String titre) {
        this.titre = titre ;
    }
    public String toString() {
        return "Code : " + this.code + " titre : " + this.titre ;
    }
}
