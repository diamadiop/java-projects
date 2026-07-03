import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);

        //1- demander le nom de l'etudiant
        System.out.println("Entrez le nom de l'etudiant");
        String  nom = clavier.nextLine();

        //2- demander les trois notes
        System.out.println("Vueiller saisir la premiere note1" );
        double note1 = clavier.nextDouble();

        System.out.println("Vueiller saisir la deuxieme  note2" );
        double note2 = clavier.nextDouble();

        System.out.println("Vueiller saisir la troisieme  note3" );
        double note3 = clavier.nextDouble();

        //3- calculons la moyenne
        double moyenne = ( note1 + note2 + note3 ) / 3;

       // 4- afficher le nom de l'etudiant
        System.out.println("Le nom de l'etudiant est " + nom );


        // 5- affichons les trois notes
        System.out.println("la note1 est : " + note1);
        System.out.println("la note2 est : " + note2);
        System.out.println("la note3 est : " + note3);

         // 6- affichons la moyenne
        System.out.println("la moyenne est :" +moyenne );

    }

}