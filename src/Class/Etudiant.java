package Class;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Etudiant {
    private long numerodEtudiant;
    private String nomEtudiant;
    private String prenomdEtudiant;
    public Etudiant(){
        this.numerodEtudiant = 1111111;
        this.nomEtudiant = null;
        this.prenomdEtudiant = null;

    }
    public Etudiant(long numerodEtudiant, String nomEtudiant, String prénomdEtudiant){
        this.numerodEtudiant = numerodEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.prenomdEtudiant = prenomdEtudiant;
    }

    public long getNumerodEtudiant() {

        return numerodEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public String getPrenomdEtudiant() {
        return prenomdEtudiant;
    }

    public void setNumerodEtudiant(long numerodEtudiant) {
        this.numerodEtudiant = numerodEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public void setPrenomdEtudiant(String prenomdEtudiant) {
        this.prenomdEtudiant = prenomdEtudiant;
    }
    public void inscrireEtudiant(){
        File fichier = new File("src/Class/inscrit/inscription.txt");
        File fichierEtudiant = new File("src/Class/etudiant/"+ this.numerodEtudiant +".txt");
        FileWriter ecrireFichierEtudiant;
        FileWriter ecrireFichier;
        FileReader lireFichier;
        try {
            lireFichier = new FileReader(fichier);

            String origineText = "";
            int i = 0;
            while ((i = lireFichier.read()) != -1){
                origineText += (char)i;
            }
            ecrireFichier = new FileWriter(fichier);


            String text = new String("Etudiant : " + this.nomEtudiant + " " + this.prenomdEtudiant + "\n" +
                    "Numero   : " + this.numerodEtudiant + "\n\n" );

            ecrireFichierEtudiant = new FileWriter(fichierEtudiant);
            ecrireFichierEtudiant.write(text);

            text = origineText + text;

            ecrireFichier.write(text);
            ecrireFichierEtudiant.close();
            ecrireFichier.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
