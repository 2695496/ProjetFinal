package Class;

public class Note {
private long numeroduCours;
private String code;
private String titre;
public Note(){
    this.numeroduCours = 11111;
    this.code = null;
    this.titre = null;
}
    public Note(long numeroduCours, String code, String titre){
        this.numeroduCours = numeroduCours;
        this.code = code;
        this.titre = titre;
    }

    public long getNumeroduCours() {
        return numeroduCours;
    }

    public String getCode() {
        return code;
    }



    public String getTitre() {
        return titre;
    }

    public void setNumeroduCours(long numeroduCours) {
        this.numeroduCours = numeroduCours;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
