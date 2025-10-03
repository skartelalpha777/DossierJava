import java.util.Scanner;
public class Calendrier {

    public  static void main( String[] args ) {

        Scanner clavier = new Scanner(System.in);
        System.out.println("Veillez entrer le moi en entier");
        int mois=clavier.nextInt();
        System.out.println("Veillez entrer l'anné en entier");
        int annee=clavier.nextInt();
        afficherTitre(mois,annee);
        afficherEntête();

    }
    public static String nomMois( int mois){
        String [] tab= new String [12];
        tab[0] = "Janvier";
        tab[1] = "Février";
        tab[2] = "Mars";
        tab[3] = "Avril";
        tab[4] = "Mai";
        tab[5] = "Juin";
        tab[6] = "Juillet";
        tab[7] = "Aout";
        tab[8] = "Septembre";
        tab[9] = "Octobre";
        tab[10] = "Novembre";

        return tab[mois-1];
    }




    public static void afficherTitre(int mois, int année){


        System.out.println("=======================");
        System.out.println("     "+nomMois(mois)+" "+année);
        System.out.println("=======================");
    }

  static void AfficherEntête
        System.out.println("LU  Ma  Me  Je  Ve  Sa  Di");

    }

}
