import java.util.Random;
import java.util.Scanner;
import Class.Etudiant;
public class Test {
    static Scanner sc = new Scanner(System.in);
    public static int generateurCode(int minimun, int maximum){
        Random rand = new Random();
        return rand.nextInt(maximum- minimun + 1) + minimun;
    }
    public static void main(String[] args) {
        creerEtudiant();
    }
    public static void creerEtudiant(){

        Etudiant etudiant = new Etudiant();
        System.out.print("taper le nom de l'Etudiant : ");
        etudiant.setNomEtudiant(sc.nextLine());
        System.out.print("taper le prenom de l'Etudiant : ");
        etudiant.setPrenomdEtudiant(sc.nextLine());
        etudiant.setNumerodEtudiant(generateurCode(1000000, 9000000));
        etudiant.inscrireEtudiant();
    }
}
