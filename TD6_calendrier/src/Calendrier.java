import java.util.Scanner;
public class Calendrier {

    public  static void main( String[] args ) {
/**
 Scanner clavier = new Scanner(System.in);
 System.out.println("Veillez entrer le moi en entier");
 int mois=clavier.nextInt();
 System.out.println("Veillez entrer l'anné en entier");
 int annee=clavier.nextInt();
 afficherTitre(mois,annee);*/
        AfficherEntête();
        AfficherMois(1,28);
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
        tab[11] = "Decembre";

        return tab[mois-1];
    }


    public static void afficherTitre(int mois, int année){


        System.out.println("=======================");
        System.out.println("     "+nomMois(mois)+" "+année);
        System.out.println("=======================");
    }

    public static void AfficherEntête(){
        System.out.println("LU  Ma  Me  Je  Ve  Sa  Di");

    }

    public static void AfficherMois(int decalage, int nombreDeJour){

        int [][]tab=  new int[5][7];

        int ligne=0;
        int jour=1;
        int col=0;
        for (int i = 0; i < decalage; i++) {
            System.out.print("    "); // 4 espaces pour une case vide
        }
        while(ligne<tab.length){

            if(ligne==0){
                col=col+decalage;
            }
            else{ col=0;

            }
            while(col<tab[0].length && jour<nombreDeJour+1){
                tab[ligne][col]=jour;

                if(jour<10){
                    System.out.print( "0"+tab[ligne][col]+"  ");
                }
                else{
                    System.out.print( tab[ligne][col]+"  ");

                }

                jour++;
                col++;
            }
            System.out.println();

            ligne++;
        }
    }


}