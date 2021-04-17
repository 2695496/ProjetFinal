package Class;

public class Cours {
private String identifient;
private long numerodEtudiant;
private long numeroduCours;
private long note;
    public Cours() {
        this.identifient = null;
        this.numerodEtudiant = 1111111;
        this.numeroduCours = 11111;
        this.note = 11;
    }
    public Cours(long numerodEtudiant, long numeroduCours, long note){
        this.numerodEtudiant = numerodEtudiant;
        this.numeroduCours = numeroduCours;
        this.note = note;
    }
    public Cours(String identifient, long numerodEtudiant, long numeroduCours, long note) {
        this(numerodEtudiant, numeroduCours, note);
        this.identifient = identifient;

    }

    public String getIdentifient() {
        return identifient;
    }

    public long getNumerodEtudiant() {
        return numerodEtudiant;
    }

    public long getNumeroduCours() {
        return numeroduCours;
    }

    public long getNote() {
        return note;
    }

    public void setIdentifient(String identifient) {
        this.identifient = identifient;
    }

    public void setNumerodEtudiant(long numerodEtudiant) {
        this.numerodEtudiant = numerodEtudiant;
    }

    public void setNumeroduCours(long numeroduCours) {
        this.numeroduCours = numeroduCours;
    }

    public void setNote(long note) {
        this.note = note;
    }
}


